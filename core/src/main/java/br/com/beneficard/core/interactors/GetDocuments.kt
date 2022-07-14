package br.com.beneficard.core.interactors

import br.com.beneficard.core.data.DocumentRepository

class GetDocuments (private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() =
        documentRepository.getDocuments()
}