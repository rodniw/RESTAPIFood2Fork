package dev.rodni.ru.restapifood2fork.home

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import dagger.android.support.DaggerAppCompatActivity

//TODO create and attach view model to this home activity
class HomeActivity : DaggerAppCompatActivity(), View.OnClickListener {

    //TODO inject view model factory

    //TODO data binding and view model by lazy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(p0: View?) {
        TODO("not implemented")
    }
}