package com.example.demofode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.demofode.AdapterModel.FragmenAdapterTab
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class fragment_home_food : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     val view : View
     view  = inflater.inflate(R.layout.fragment_home_food, container, false)
        val pager2food : ViewPager2 = view.findViewById(R.id.page2_food)
        val tabfood : TabLayout = view.findViewById(R.id.tab_food)
        val adapter = FragmenAdapterTab(this)
        pager2food.adapter = adapter
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
        return view
    }

}