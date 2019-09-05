package dev.rodni.ru.restapifood2fork.internal.di

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector

//main dagger class in this module
abstract class DaggerApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {

    //i need activity and fragment injectors
    //override fun activityInjector(): DispatchingAndroidInjector<Activity>
    //override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment>

    //init dagger app compat inside on create method
    override fun onCreate() {
        super.onCreate()
        //DaggerAppComponent.builder().create(this).inject(this)
    }
}