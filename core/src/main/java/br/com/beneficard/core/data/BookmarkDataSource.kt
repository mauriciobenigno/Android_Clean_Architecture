package br.com.beneficard.core.data

import br.com.beneficard.core.domain.Bookmark
import br.com.beneficard.core.domain.Document


interface BookmarkDataSource {

    suspend fun add(document: Document, bookmark: Bookmark)

    suspend fun read(document: Document): List<Bookmark>

    suspend fun remove(document: Document, bookmark: Bookmark)
}
