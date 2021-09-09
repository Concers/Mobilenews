package com.example.mobilenews.util

import android.widget.EditText
import androidx.databinding.BindingAdapter

object BindingAdapter{

    @BindingAdapter("setNewsHeader")
    fun setNewsHeader(view : EditText, value : String){
        view.setText(value)
    }
}