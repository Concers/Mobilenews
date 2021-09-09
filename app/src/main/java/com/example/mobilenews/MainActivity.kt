package com.example.mobilenews

import android.os.Bundle
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


        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.commit()


        val detailFragment = DetailFragment()

       fragmentTransaction.add(binding.frmContainer.id, detailFragment)

        val newsFragment = NewsFragment()

        fragmentTransaction.add(binding.frmContainer.id, newsFragment,)

        // ekle addtoBackStack

    }
}
