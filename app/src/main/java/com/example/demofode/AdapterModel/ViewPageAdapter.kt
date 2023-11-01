package com.example.demofode.AdapterModel

import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.demofode.R
import com.example.demofode.frag_onboarding1
import com.example.demofode.frag_onboarding2
import com.example.demofode.frag_onbroading3
import com.example.demofode.fragment_special

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment
        if (position == 0) {
            fragment = frag_onboarding1()
        } else if (position ==1){
            fragment = frag_onboarding2()
        }
        else
        {
            fragment = frag_onbroading3()
        }
        return fragment
    }
    override fun getItemCount(): Int {
        return 3
    }
}
