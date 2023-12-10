package com.example.demofode

import android.os.Bundle
import android.os.Process
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.demofode.AdapterModel.ViewPagerAdapter
import com.example.demofode.databinding.ActivitySplashBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class activity_splash : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewPager2 = binding.page2
        binding.page2.adapter = ViewPagerAdapter(this)
        binding.page2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        val tabLayout = binding.tabLayout
        tabLayout.tabMode = TabLayout.MODE_AUTO
        TabLayoutMediator(tabLayout, viewPager2) {
                tab, position ->
        }.attach()
        val btnNextFragment = binding.btnNextFragment
        btnNextFragment.setOnClickListener{
            val curenpage = viewPager2.currentItem
            viewPager2.setCurrentItem(curenpage + 1)
            if (curenpage ==1){
                btnNextFragment.visibility = View.GONE
//                val pid = Process.myPid()
//                Process.killProcess(pid)
            }
        }
    }
}