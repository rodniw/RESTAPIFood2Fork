package dev.rodni.ru.data.remote.api

import dev.rodni.ru.data.remote.model.RecipeRemoteModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

const val TIMEOUT = 10L
//todo add methods and refactor return types
interface RecipeService {

    // SEARCH
    @GET("api/search")
    //@Wrapped()
    suspend fun getSearchRecipeList(
            @Query("key") key: String,
            @Query("q") query: String,
            @Query("page") page: String
    ): Response<List<RecipeRemoteModel>>

    // GET RECIPE REQUEST
    @GET("api/get")
    suspend fun getRecipe(
            @Query("key") key: String,
            @Query("rId") recipe_id: String
    ): Response<List<RecipeRemoteModel>>

}