package br.com.beneficard.core.interactors

import br.com.beneficard.core.data.BookmarkRepository
import br.com.beneficard.core.domain.Document

class GetBookmarks (private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document) =
        bookmarkRepository.getBookmarks(document)
}