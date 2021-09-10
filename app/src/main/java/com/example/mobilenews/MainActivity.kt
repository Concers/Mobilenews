package com.example.mobilenews

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mobilenews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )


        val newsFragment = NewsFragment()
        val newsFragment2 = NewsFragment()
        val newsFragment3 = NewsFragment()
        val newsFragment4 = NewsFragment()
        val newsFragment5 = NewsFragment()
        val newsFragment6 = NewsFragment()
        val newsFragment7 = NewsFragment()
        val newsFragment8 = NewsFragment()
        val newsFragment9 = NewsFragment()
        val newsFragment10 = NewsFragment()






        val fragmentTransaction = supportFragmentManager.beginTransaction()
            .add(binding.frmContainerNews1.id, newsFragment)
            .add(binding.frmContainerNews2.id, newsFragment2)
            .add(binding.frmContainerNews3.id, newsFragment3)
            .add(binding.frmContainerNews4.id, newsFragment4)
            .add(binding.frmContainerNews5.id, newsFragment5)
            .add(binding.frmContainerNews6.id, newsFragment6)
            .add(binding.frmContainerNews7.id, newsFragment7)
            .add(binding.frmContainerNews8.id, newsFragment8)
            .add(binding.frmContainerNews9.id, newsFragment9)
            .add(binding.frmContainerNews10.id, newsFragment10)
            .addToBackStack(null)
            .commit()




        binding.frmContainerNews1.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }


        binding.frmContainerNews2.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)

                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews3.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews4.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews5.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews6.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews7.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews8.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews9.setOnClickListener {
            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
        binding.frmContainerNews10.setOnClickListener {

            val detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .remove(newsFragment)
                .remove(newsFragment2)
                .remove(newsFragment3)
                .remove(newsFragment4)
                .remove(newsFragment5)
                .remove(newsFragment6)
                .remove(newsFragment7)
                .remove(newsFragment8)
                .remove(newsFragment9)
                .remove(newsFragment10)
                .addToBackStack(null)
                .add(binding.frmContainerDetail.id, detailFragment)
                .commit()
            Log.e("Tıklandı", "tıklandı1")
        }
    }
}


// ekle addtoBackStack




