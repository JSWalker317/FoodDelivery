package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.view.size
import androidx.viewpager.widget.ViewPager

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        val viewPager = findViewById<ViewPager>(R.id.viewpager_board)
        val next = findViewById<ImageView>(R.id.img_boading_next)

        viewPager.adapter = BoardingAdapter(supportFragmentManager)
        next.setOnClickListener(View.OnClickListener {
            if (viewPager.currentItem < viewPager.size) {
                viewPager.currentItem = viewPager.currentItem +1
            }
            else{
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
            }
        })


    }
}