package br.com.beneficard.core.data

import br.com.beneficard.core.domain.Document

interface OpenDocumentDataSource {

    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}
