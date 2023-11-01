package com.example.demofode.AdapterModel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.demofode.PackageFragment.frag_onboarding1
import com.example.demofode.PackageFragment.frag_onboarding2
import com.example.demofode.PackageFragment.frag_onbroading3

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
