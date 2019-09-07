package dev.rodni.ru.domain.repository

import dev.rodni.ru.domain.model.RecipeModel

interface RecipeRepository {
    suspend fun getListRecipies(listRecipies: List<RecipeModel>)

    suspend fun getRecipe(recipe: RecipeModel)
}