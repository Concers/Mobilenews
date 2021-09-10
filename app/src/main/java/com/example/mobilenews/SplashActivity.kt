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

        splashActivityStart(3000)

    }

    private fun splashActivityStart(milis: Long) {
        object : Thread() {
            override fun run() {
                try {
                    sleep(milis)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }.start()
    }

}