package com.raywenderlich.android.majesticreader.core.data

import com.raywenderlich.android.majesticreader.core.domain.Bookmark
import com.raywenderlich.android.majesticreader.core.domain.Document
import javax.inject.Inject

class BookmarkRepository @Inject constructor(private val dataSource: BookmarkDataSource) {
    suspend fun addBookmark(document: Document, bookmark: Bookmark) =
        dataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = dataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) =
        dataSource.remove(document, bookmark)
}
