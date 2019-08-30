package dev.rodni.ru.restapifood2fork.data

import dev.rodni.ru.restapifood2fork.R
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val api_key: String = (R.string.api_key).toString()
const val base_url: String = (R.string.base_url).toString()

interface FoodForkApi {

    companion object {
        operator fun invoke(
            connectivityInterceptor: ConnectivityInterceptor
        ) : FoodForkApi {
            val requestInterceptor = Interceptor { chain ->
                val url = chain.request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("key", api_key)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()

                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .addInterceptor(connectivityInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(base_url)
                //.addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(FoodForkApi::class.java)
        }
    }
}