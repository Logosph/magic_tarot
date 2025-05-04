package ru.damapi.domain.models

data class CardModel (
    val id: Int,
    val name: String,
    val meaning: String,
    val imageUrl: String?,
    val interpretationOfTheDay: String
)
/*
{
  "id": 0,
  "name": "string",
  "meaning": "string",
  "image_url": "string",
  "interpretation_of_day": "string"
}
 */
