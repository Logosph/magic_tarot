package ru.damapi.domain.models

data class CardModel (
    val id: Int,
    val name: String,
    val meaning: String,
    val imageUrl: String?,
    val interpretationOfTheDay: String
)
