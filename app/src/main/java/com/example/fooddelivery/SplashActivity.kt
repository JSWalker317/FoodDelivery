package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val SPLASH = 3000

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        val intent = Intent(this,WelcomeActivity::class.java)
//        startActivity(intent)

        var topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        var bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        var imageView = findViewById<ImageView>(R.id.img_intro)
        var textView = findViewById<TextView>(R.id.tv_intro)

        imageView.setAnimation(topAnim)
        textView.setAnimation(bottomAnim)

        Handler().postDelayed({
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH.toLong())
    }
}