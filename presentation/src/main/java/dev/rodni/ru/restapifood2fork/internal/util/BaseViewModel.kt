package dev.rodni.ru.restapifood2fork.internal.util

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel

//base view model class
//i will extend all of my view models from this
abstract class BaseViewModel : AndroidViewModel {

    private val context: Context

    //todo refactor to use coroutines
    //private val compositeDisposable = CompositeDisposable()

    constructor(application: Application) : super(application) {
        this.context = application
    }

    //adding a given disposable to the single composite disposable
    //fun addDisposable(disposable: Disposable) {
    //    compositeDisposable += disposable
    //}

    //this method clear all disposables inside the composite disposable
    //override fun onCleared() {
    //    compositeDisposable.dispose()
    //}
}