package dev.rodni.ru.restapifood2fork

import android.app.Application
import android.content.res.Configuration
import android.util.Log
import com.jakewharton.threetenabp.AndroidThreeTen

class FoodToForkApplication: Application() {
    private val TAG = "FoodToForkApplication"

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate()")
        AndroidThreeTen.init(this)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.i(TAG, "configuration changed")
    }
}