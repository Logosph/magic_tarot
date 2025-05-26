package ru.damapi.data.responses

import ru.damapi.domain.models.CardModel

data class CardResponse(
    val id: Int,
    val name: String,
    val meaning: String,
    val image_url: String,
    val interpretation_of_day: String?
) {
    fun toModel(): CardModel? {
        return CardModel(
            id = id,
            name = name,
            meaning = meaning,
            imageUrl = image_url,
            interpretationOfTheDay = interpretation_of_day
        )
    }
}