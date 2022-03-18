package com.example.fooddelivery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class BoardingAdapter(fragmentManager: FragmentManager) :FragmentPagerAdapter(fragmentManager) {

   private val fragments = listOf(
       OnBoarding1_Fragment(),
       OnBoarding2_Fragment(),
       OnBoarding3_Fragment()
   )

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }
}