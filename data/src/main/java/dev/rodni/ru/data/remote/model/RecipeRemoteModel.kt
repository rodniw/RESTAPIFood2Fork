package dev.rodni.ru.data.remote.model

data class RecipeRemoteModel(
        val title: String,
        val publisher: String,
        val ingredients: List<String>,
        val recipe_id: String,
        val image_url: String,
        val social_rank: Float
)
