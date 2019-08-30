package dev.rodni.ru.restapifood2fork

import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import dev.rodni.ru.restapifood2fork.utils.hide
import dev.rodni.ru.restapifood2fork.utils.show
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_button_view.setOnClickListener{
            if (progressBar_loading.isVisible) {
                progressBar_loading.hide()
            } else {
                progressBar_loading.show()
            }
        }
    }
}
