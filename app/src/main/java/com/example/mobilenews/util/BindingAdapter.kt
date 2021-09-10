package com.example.mobilenews.util

import android.widget.EditText
import androidx.databinding.BindingAdapter
import com.example.mobilenews.mock.News

object BindingAdapter{

    @BindingAdapter("setNewsHeader")
    fun setNewsHeader(view : EditText, value : String){
        view.setText(value)
    }

}

