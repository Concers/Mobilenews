package com.example.mobilenews

import android.os.Bundle
import android.util.Log
import android.view.View
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

        val fragmentTransaction = supportFragmentManager.beginTransaction()
            .add(binding.frmContainerNews.id, newsFragment)


        fun replace(view: View) {
            Log.e("replace", "Replace")
        }

        binding.frmContainerNews.setOnClickListener {
            replace(view = it)
            fragmentTransaction.remove(newsFragment)
            val detailFragment = DetailFragment()
            val trans = supportFragmentManager.beginTransaction()
            trans.replace(binding.frmContainerNews.id, detailFragment)
                .addToBackStack(null)
            trans.commit()
            Log.e("frmContainer ", "MainActivity")


        }

        fragmentTransaction.commit()
    }


}


// ekle addtoBackStack




