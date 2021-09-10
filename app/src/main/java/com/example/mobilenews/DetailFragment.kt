package com.example.mobilenews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.mobilenews.databinding.FragmentDetailBinding
import com.example.mobilenews.util.getDetailContext
import com.example.mobilenews.util.getDetaildate
import com.example.mobilenews.util.getDetailheaderTitle


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detail, container, false
        )

        binding.header = getDetailheaderTitle()
        binding.date = getDetaildate()
        binding.context = getDetailContext()
        binding.imageUrl =
            "https://blog.jetbrains.com/wp-content/uploads/2021/07/1.5.30-M1_banners-01.png"
        // Inflate the layout for this fragment
        return binding.root
    }


}