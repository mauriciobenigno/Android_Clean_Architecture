package com.raywenderlich.android.majesticreader.core.data

import com.raywenderlich.android.majesticreader.core.domain.Document
import javax.inject.Inject

class DocumentRepository @Inject constructor(private val dataSource: DocumentDataSource, private val openDocumentDataSource: OpenDocumentDataSource) {
    suspend fun addDocument(document: Document) =
        dataSource.add(document)

    suspend fun getDocuments() = dataSource.readAll()

    suspend fun removeDocument(document: Document) =
        dataSource.remove(document)

    fun setOpenDocument(document: Document) =
        openDocumentDataSource.setOpenDocument(document)

    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()
}