package com.example.mobilenews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.mobilenews.databinding.FragmentNewsBinding
import com.example.mobilenews.util.getDetailheaderTitle

class NewsFragment : Fragment() {

    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_news, container, false
        )
        // Set TExt
        binding.header = getDetailheaderTitle()
        binding.imageUrl =
            "https://blog.jetbrains.com/wp-content/uploads/2021/07/1.5.30-M1_banners-01.png"
        return binding.root

    }
}
