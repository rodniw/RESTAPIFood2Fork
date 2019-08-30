package dev.rodni.ru.restapifood2fork.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ProgressBar
import android.widget.Toast
import androidx.constraintlayout.widget.Group
import com.google.android.material.snackbar.Snackbar

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun ProgressBar.show() {
    visibility = View.VISIBLE
}

fun ProgressBar.hide() {
    visibility = View.GONE
}

fun Group.show() {
    visibility = View.VISIBLE
}

fun Group.hide() {
    visibility = View.GONE
}

fun View.snackbar(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_LONG).also { snackbar ->
        snackbar.setAction("ok") {
            snackbar.dismiss()
        }
    }.show()
}

fun View.hideKeyboard() {
    val inputMethodManager  = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager .hideSoftInputFromWindow(windowToken, 0)
}