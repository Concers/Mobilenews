package com.example.mobilenews.util

import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.annotation.IdRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mobilenews.R
import com.example.mobilenews.mock.News

object BindingAdapter{

    @JvmStatic
    @BindingAdapter("profileImage")
    fun loadImage(view: ImageView, imageUrl: String?) {
        Glide.with(view.context)
            .load(imageUrl).apply(RequestOptions())
            .into(view)
    }
}

