package com.raywenderlich.android.majesticreader.core.interactors

import com.raywenderlich.android.majesticreader.core.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.core.domain.Bookmark
import com.raywenderlich.android.majesticreader.core.domain.Document
import javax.inject.Inject

class RemoveBookmark @Inject constructor(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.removeBookmark(document, bookmark)
}