package com.raywenderlich.android.majesticreader.core.interactors

import com.raywenderlich.android.majesticreader.core.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.core.domain.Document
import javax.inject.Inject

class GetBookmarks @Inject constructor(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document) =
        bookmarkRepository.getBookmarks(document)
}