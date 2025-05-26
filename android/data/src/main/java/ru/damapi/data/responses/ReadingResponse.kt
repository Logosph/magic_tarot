package ru.damapi.data.responses

import ru.damapi.domain.models.ReadingWithCardsModel

data class ReadingResponse(
    val reading_id: Int,
    val cards: List<CardResponse>
) {
    fun toModel(): ReadingWithCardsModel? {
        if (cards.isEmpty()) return null
        return ReadingWithCardsModel(
            readingId = reading_id,
            cards = cards.mapNotNull { it.toModel() }
        )
    }
}