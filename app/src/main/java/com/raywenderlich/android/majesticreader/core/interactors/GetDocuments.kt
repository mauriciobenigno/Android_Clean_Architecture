package com.raywenderlich.android.majesticreader.core.interactors

import com.raywenderlich.android.majesticreader.core.data.DocumentRepository
import javax.inject.Inject

class GetDocuments @Inject constructor(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() =
        documentRepository.getDocuments()
}