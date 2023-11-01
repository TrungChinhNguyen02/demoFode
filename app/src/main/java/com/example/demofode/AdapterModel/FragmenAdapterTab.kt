package com.example.demofode.AdapterModel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.demofode.PackageFragment.fragment_Food
import com.example.demofode.PackageFragment.fragment_allmenu
import com.example.demofode.PackageFragment.fragment_pizza
import com.example.demofode.PackageFragment.fragment_special
import com.example.demofode.PackageFragment.fragment_top

class FragmenAdapterTab(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment
        if (position == 0) {
            fragment = fragment_special()
        } else if (position ==1){
            fragment = fragment_pizza()
        }
        else if (position ==2)
        {
            fragment = fragment_top()
        }
        else if (position ==3){
            fragment = fragment_allmenu()
        }
        else{
            fragment = fragment_Food()
        }
        return fragment
    }
    override fun getItemCount(): Int {
        return 5
    }
}