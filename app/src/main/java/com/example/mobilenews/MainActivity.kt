package com.example.mobilenews

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.replace
import com.example.mobilenews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        val detailFragment = DetailFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
            .replace(binding.frmContainerdetail.id, detailFragment)
        fragmentTransaction.commit()


        val newsFragment1 = NewsFragment()
        val newsFragment2 = NewsFragment()
        val newsFragment3 = NewsFragment()
        val newsFragment4 = NewsFragment()
        val newsFragment5 = NewsFragment()
        val newsFragment6 = NewsFragment()
        val newsFragment7 = NewsFragment()
        val newsFragment8 = NewsFragment()

        fragmentTransaction.replace(binding.frmContainerNews1.id, newsFragment1)
        fragmentTransaction
            .add(binding.frmContainerNews2.id, newsFragment2)






        with(fragmentTransaction) {


            replace(binding.frmContainerNews4.id, newsFragment3)

            replace(binding.frmContainerNews5.id, newsFragment4)

            replace(binding.frmContainerNews6.id, newsFragment5)

            replace(binding.frmContainerNews7.id, newsFragment6)

            replace(binding.frmContainerNews8.id, newsFragment7)

            replace(binding.frmContainerNews9.id, newsFragment8)


        }

        binding.frmContainerNews1.setOnClickListener {
//            binding.frmContainerNews1.removeAllViews()
//            binding.frmContainerNews2.removeAllViews()
//            binding.frmContainerNews3.removeAllViews()
//            binding.frmContainerNews4.removeAllViews()
//            binding.frmContainerNews5.removeAllViews()
//            binding.frmContainerNews6.removeAllViews()
//            binding.frmContainerNews7.removeAllViews()
//            binding.frmContainerNews8.removeAllViews()
//            binding.frmContainerNews9.removeAllViews()

            val detailFragment = DetailFragment()
            fragmentTransaction.add(binding.frmContainerdetail.id, detailFragment)
                .addToBackStack(null)
            fragmentTransaction.replace<NewsFragment>(R.id.frmContainerdetail)


            Log.e("frmContainer ", "Tıklandı")

        }


    }


}


// ekle addtoBackStack




