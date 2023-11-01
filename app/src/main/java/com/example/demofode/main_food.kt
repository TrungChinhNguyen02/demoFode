package com.example.demofode

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.viewpager2.widget.ViewPager2
import com.example.demofode.AdapterModel.FragmenAdapterTab
import com.example.demofode.databinding.ActivityMainFoodBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class main_food : AppCompatActivity() {
    lateinit var binding: ActivityMainFoodBinding
        val TAG ="main_food"

    override fun onCreate(savedInstanceState: Bundle?) {
        val btnNext : Button
        super.onCreate(savedInstanceState)
        binding = ActivityMainFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pager2food= binding.page2Food
        val tabfood = binding.tabFood

        btnNext = findViewById(R.id.nextmain)
        btnNext.setOnClickListener {

            val intent = Intent(this@main_food, activity_food::class.java)
            startActivity(intent)

        }

        pager2food.setAdapter(FragmenAdapterTab(this))
        pager2food.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL)
        tabfood.setTabMode(TabLayout.MODE_AUTO)
        TabLayoutMediator(
            tabfood, pager2food
        ) { tab, position ->
            if (position == 0) {
                tab.text = "Special"
            }
            if (position == 1) {
                tab.text = "Pizza"
            }
            if (position == 2) {
                tab.text = "Top"
            }
            if (position == 3) {
                tab.text = "All Menu"
            }
            if (position == 4) {
                tab.text = "Food"
            }
        }.attach()

    }


}