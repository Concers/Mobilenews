package com.example.mobilenews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilenews.databinding.FragmentNewsBinding
import com.example.mobilenews.mock.News

class NewsAdapter(private val newsList: List<News>) : RecyclerView.Adapter<NewsViewHolder>() {

    private lateinit var binding: FragmentNewsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_news,
            parent,
            false

        )
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsList = newsList[position]
        holder.bind(newsList, position)
    }

    override fun getItemCount(): Int = newsList.size


}