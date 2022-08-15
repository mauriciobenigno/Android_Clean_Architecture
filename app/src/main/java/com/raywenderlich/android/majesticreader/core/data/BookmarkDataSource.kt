package com.raywenderlich.android.majesticreader.core.data

import com.raywenderlich.android.majesticreader.core.domain.Bookmark
import com.raywenderlich.android.majesticreader.core.domain.Document


interface BookmarkDataSource {

    suspend fun add(document: Document, bookmark: Bookmark)

    suspend fun read(document: Document): List<Bookmark>

    suspend fun remove(document: Document, bookmark: Bookmark)
}
