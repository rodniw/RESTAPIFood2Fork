package dev.rodni.ru.domain.model

data class RecipeModel(
        val title: String,
        val publisher: String,
        val ingredients: List<String>?,
        val recipe_id: String,
        val image_url: String,
        val social_rank: Float
) {
    companion object {
        val EMPTY = RecipeModel("", "", null, "", "", 0F)
    }
}