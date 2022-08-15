package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.core.data.OpenDocumentDataSource
import com.raywenderlich.android.majesticreader.core.domain.Document


class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}
