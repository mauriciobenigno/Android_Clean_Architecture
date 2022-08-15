package com.raywenderlich.android.majesticreader.core.interactors

import com.raywenderlich.android.majesticreader.core.data.DocumentRepository
import com.raywenderlich.android.majesticreader.core.domain.Document
import javax.inject.Inject

class RemoveDocument @Inject constructor(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke(document: Document) =
        documentRepository.removeDocument(document)
}