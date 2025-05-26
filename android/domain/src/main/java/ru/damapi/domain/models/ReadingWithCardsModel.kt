package ru.damapi.domain.models

data class ReadingWithCardsModel (
    val readingId: Int,
    val cards: List<CardModel>
)