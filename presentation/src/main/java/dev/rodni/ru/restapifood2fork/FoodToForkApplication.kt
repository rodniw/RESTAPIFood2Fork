package dev.rodni.ru.restapifood2fork

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.multidex.MultiDex
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class FoodToForkApplication: Application() {
    companion object {
        private const val TAG = "FoodToForkApplication"
    }

    /**
     * Versions of the platform prior to Android 5.0 (API level 21) use the Dalvik runtime for executing app code.
     * By default, Dalvik limits apps to a single classes.dex bytecode file per APK.
     * In order to get around this limitation, we can add the multidex support library to project.
     */
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate()")
        AndroidThreeTen.init(this)
    }

}