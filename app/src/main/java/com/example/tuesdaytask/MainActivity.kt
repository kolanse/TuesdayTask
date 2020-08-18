package com.example.tuesdaytask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    lateinit var viewPagerAdapter: viewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.view_pager)


        viewPagerAdapter = viewPagerAdapter(this, 3)

        viewPager2.adapter = viewPagerAdapter
        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            when(position){
                0 -> {tab.text = "Monday" }
                1 -> tab.text = "Tuesday"
                2 -> tab.text = "Wednesday"
            }

        }.attach()


    }
}