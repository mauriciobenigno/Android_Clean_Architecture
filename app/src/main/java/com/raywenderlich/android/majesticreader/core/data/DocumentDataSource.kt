package com.raywenderlich.android.majesticreader.core.data

import com.raywenderlich.android.majesticreader.core.domain.Document


interface DocumentDataSource {

    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}
