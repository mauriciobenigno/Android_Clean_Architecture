package br.com.beneficard.core.interactors

import br.com.beneficard.core.data.DocumentRepository
import br.com.beneficard.core.domain.Document

class AddDocument (private val documentRepository: DocumentRepository){
    suspend operator fun invoke(document: Document) =
        documentRepository.addDocument(document)
}