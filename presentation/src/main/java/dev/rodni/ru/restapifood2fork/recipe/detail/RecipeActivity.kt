package dev.rodni.ru.restapifood2fork.recipe.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import dagger.android.support.DaggerAppCompatActivity
import dev.rodni.ru.restapifood2fork.R

class RecipeActivity : DaggerAppCompatActivity() {

    //TODO provide view model factory and navigator by dagger

    //TODO data binding

    //todo attach rating view model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        //todo attach action bar

        //todo get event from injected navigator and set it to the special field inside the view model

        //todo observe for the recipe change and then change the ui
    }

    override fun getParentActivityIntent(): Intent? {
        return super.getParentActivityIntent()?.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //todo inflate a menu
        return true
    }
}
