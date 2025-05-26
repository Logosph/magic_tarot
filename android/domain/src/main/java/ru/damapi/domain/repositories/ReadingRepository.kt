package ru.damapi.domain.repositories

import ru.damapi.domain.models.ReadingWithCardsModel

interface ReadingRepository {
    suspend fun getCardsByQuestion(question: String): ReadingWithCardsModel?
    suspend fun getInterpretation(readingId: Int): String?
}