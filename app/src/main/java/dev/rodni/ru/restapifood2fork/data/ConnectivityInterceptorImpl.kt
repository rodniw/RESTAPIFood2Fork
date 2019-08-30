package dev.rodni.ru.restapifood2fork.data

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import dev.rodni.ru.restapifood2fork.R
import dev.rodni.ru.restapifood2fork.utils.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

class ConnectivityInterceptorImpl(
    context: Context
) : ConnectivityInterceptor {
    private val TAG = "ConnectivityInterImpl"

    private val applicationContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable())
            throw NoInternetException(applicationContext.getString(R.string.check_internet_connectivity))

        return chain.proceed(chain.request())
    }

    private fun isInternetAvailable(): Boolean {
        val connectivityManager =
            applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        connectivityManager.activeNetworkInfo.also {
            Log.d(TAG, "isInternetAvailable" + it.isConnected)
            return it !=null && it.isConnected
        }
    }

}