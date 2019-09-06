package dev.rodni.ru.data.remote.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.serjltt.moshi.adapters.Wrapped
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import dev.rodni.ru.data.BuildConfig
import dev.rodni.ru.data.remote.model.RecipeRemoteModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BASIC
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class RecipeApi(baseUrl: String) : RecipeService {

    //const of the request timeout
    companion object {
        private const val TIMEOUT = 10L
    }

    private var service: RecipeService

    //todo deal with this errors
    init {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = if (BuildConfig.DEBUG) BODY else BASIC

        val httpClient = OkHttpClient.Builder()
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)

        val client = httpClient.build()

        val moshi = Moshi.Builder()
                .add(Wrapped.ADAPTER_FACTORY)
                .add(KotlinJsonAdapterFactory())
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .client(client)
                .build()


        service = retrofit.create(RecipeService::class.java)
    }

    override suspend fun getSearchRecipeList(key: String, query: String, page: String):
            Response<List<RecipeRemoteModel>> = service.getSearchRecipeList(key, query, page)

    override suspend fun getRecipe(key: String, recipe_id: String):
            Response<List<RecipeRemoteModel>> = service.getRecipe(key, recipe_id)
}