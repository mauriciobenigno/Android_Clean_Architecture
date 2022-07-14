package br.com.beneficard.core.interactors

import br.com.beneficard.core.data.DocumentRepository

class GetOpenDocument (private val openDocumentRepository: DocumentRepository) {
    operator fun invoke() =
        openDocumentRepository.getOpenDocument()
}