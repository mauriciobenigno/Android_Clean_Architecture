package com.raywenderlich.android.majesticreader.framework

import br.com.beneficard.core.data.OpenDocumentDataSource
import br.com.beneficard.core.domain.Document


class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}
