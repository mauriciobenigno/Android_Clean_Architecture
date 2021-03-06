package br.com.beneficard.core.data

import br.com.beneficard.core.domain.Document

class DocumentRepository(private val dataSource: DocumentDataSource, private val openDocumentDataSource: OpenDocumentDataSource) {
    suspend fun addDocument(document: Document) =
        dataSource.add(document)

    suspend fun getDocuments() = dataSource.readAll()

    suspend fun removeDocument(document: Document) =
        dataSource.remove(document)

    fun setOpenDocument(document: Document) =
        openDocumentDataSource.setOpenDocument(document)

    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()
}