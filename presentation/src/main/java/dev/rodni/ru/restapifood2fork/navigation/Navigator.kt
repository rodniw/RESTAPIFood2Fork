package dev.rodni.ru.restapifood2fork.navigation

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import dev.rodni.ru.restapifood2fork.home.HomeActivity
import dev.rodni.ru.restapifood2fork.recipe.detail.RecipeActivity

class Navigator {

    companion object {
        private val EXTRA_EVENT = "${RecipeActivity::class.java.`package`?.name}.extra.EVENT"
    }

    fun navigateToHome(activity: Activity) {
        val intent = Intent(activity, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        activity.startActivity(intent)
    }

    fun navigateToEvent(activity: Activity, event: Int, sharedViews: Array<Pair<View, String>>) {
        val intent = Intent(activity, RecipeActivity::class.java)
        intent.putExtra(EXTRA_EVENT, event)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, *sharedViews).toBundle()
        ActivityCompat.startActivity(activity, intent, options)
    }

    fun getEvent(activity: Activity) = activity.intent.getIntExtra(EXTRA_EVENT, 0)

}