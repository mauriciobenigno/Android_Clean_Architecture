package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.raywenderlich.android.majesticreader.core.data.BookmarkDataSource
import com.raywenderlich.android.majesticreader.core.domain.Bookmark
import com.raywenderlich.android.majesticreader.core.domain.Document
import com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity
import com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class RoomBookmarkDataSource(context: Context) : BookmarkDataSource {

    // 1
    private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

    // 2
    override suspend fun add(document: Document, bookmark: Bookmark) =
        bookmarkDao.addBookmark(
            BookmarkEntity(
            documentUri = document.url,
            page = bookmark.page
        )
        )

    override suspend fun read(document: Document): List<Bookmark> =
        bookmarkDao.getBookmarks(document.url).map { Bookmark(it.id, it.page) }

    override suspend fun remove(document: Document, bookmark: Bookmark) =
        bookmarkDao.removeBookmark(
            BookmarkEntity(id = bookmark.id, documentUri = document.url, page = bookmark.page)
        )
}