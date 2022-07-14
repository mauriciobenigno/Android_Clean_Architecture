package br.com.beneficard.core.interactors

import br.com.beneficard.core.data.BookmarkRepository
import br.com.beneficard.core.domain.Bookmark
import br.com.beneficard.core.domain.Document

class RemoveBookmark (private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.removeBookmark(document, bookmark)
}