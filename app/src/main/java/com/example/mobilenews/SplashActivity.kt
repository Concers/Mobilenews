package com.example.mobilenews

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobilenews.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        SplashActivityStart(3000)

    }

    private fun SplashActivityStart(milis: Long) {
        object : Thread() {
            override fun run() {
                try {
                    sleep(milis)
                    val Intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(Intent)
                    finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }.start()
    }

}