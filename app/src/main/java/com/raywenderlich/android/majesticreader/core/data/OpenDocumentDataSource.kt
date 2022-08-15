package com.raywenderlich.android.majesticreader.core.data

import com.raywenderlich.android.majesticreader.core.domain.Document

interface OpenDocumentDataSource {

    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}
