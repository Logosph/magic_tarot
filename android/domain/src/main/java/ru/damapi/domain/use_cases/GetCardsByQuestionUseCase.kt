package ru.damapi.domain.use_cases

import ru.damapi.domain.models.ReadingWithCardsModel
import ru.damapi.domain.repositories.ReadingRepository

class GetCardsByQuestionUseCase(
    private val repo: ReadingRepository
) {
    suspend fun execute(question: String): ReadingWithCardsModel? {
        return repo.getCardsByQuestion(question)
    }
}