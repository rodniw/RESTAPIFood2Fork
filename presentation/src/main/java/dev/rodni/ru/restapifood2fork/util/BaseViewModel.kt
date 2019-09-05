package dev.rodni.ru.restapifood2fork.util

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel

//base view model class
//i will extend all of my view models from this
abstract class BaseViewModel : AndroidViewModel {

    private val context: Context
    //private val disposables = CompositeDisposables

    constructor(application: Application) : super(application) {
        this.context = application
    }
}