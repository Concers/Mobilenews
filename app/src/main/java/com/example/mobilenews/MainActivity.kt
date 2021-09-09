package com.example.mobilenews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
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
        val newsFragment1 = NewsFragment()
        val newsFragment2 = NewsFragment()
        val newsFragment3 = NewsFragment()
        val newsFragment4 = NewsFragment()
        val newsFragment5 = NewsFragment()
        val newsFragment6 = NewsFragment()
        val newsFragment7 = NewsFragment()
        val newsFragment8 = NewsFragment()


        with(fragmentTransaction) {
            add(binding.frmContainerNews1.id, detailFragment)
            add(binding.frmContainerNews2.id, newsFragment1)
            add(binding.frmContainerNews3.id, newsFragment2)
            add(binding.frmContainerNews4.id, newsFragment3)
            add(binding.frmContainerNews5.id, newsFragment4)
            add(binding.frmContainerNews6.id, newsFragment5)
            add(binding.frmContainerNews7.id, newsFragment6)
            add(binding.frmContainerNews8.id, newsFragment7)
            add(binding.frmContainerNews9.id, newsFragment8)


        }






}
}


        // ekle addtoBackStack




