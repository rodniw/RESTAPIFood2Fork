package dev.rodni.ru.data.remote.model

import com.squareup.moshi.Json

data class RecipeRemoteModel(
        @Json(name = "title")val title: String,
        @Json(name = "publisher")val publisher: String,
        @Json(name = "ingredients")val ingredients: List<String>,
        @Json(name = "recipe_id")val recipe_id: String,
        @Json(name = "image_url")val image_url: String,
        @Json(name = "social_rank")val social_rank: Float
)
