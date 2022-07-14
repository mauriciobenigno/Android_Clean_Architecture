package br.com.beneficard.core.data

import br.com.beneficard.core.domain.Document

interface DocumentDataSource {

    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}
