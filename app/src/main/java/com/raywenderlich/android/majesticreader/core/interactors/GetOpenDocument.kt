package com.raywenderlich.android.majesticreader.core.interactors

import com.raywenderlich.android.majesticreader.core.data.DocumentRepository
import javax.inject.Inject

class GetOpenDocument @Inject constructor(private val openDocumentRepository: DocumentRepository) {
    operator fun invoke() =
        openDocumentRepository.getOpenDocument()
}