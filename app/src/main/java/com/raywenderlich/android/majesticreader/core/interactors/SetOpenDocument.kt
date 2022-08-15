package com.raywenderlich.android.majesticreader.core.interactors

import com.raywenderlich.android.majesticreader.core.data.DocumentRepository
import com.raywenderlich.android.majesticreader.core.domain.Document
import javax.inject.Inject

class SetOpenDocument @Inject constructor(private val documentRepository: DocumentRepository) {
    operator fun invoke(document: Document) =
        documentRepository.setOpenDocument(document)
}