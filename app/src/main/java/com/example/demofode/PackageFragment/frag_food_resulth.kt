package com.example.demofode.PackageFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demofode.API.Api_GetAll
import com.example.demofode.AdapterModel.FragmentAdpterRcv_Populer
import com.example.demofode.AdapterModel.ViewPagerAdapter
import com.example.demofode.AdapterModel.adapterFragCampai
import com.example.demofode.Model.Product
import com.example.demofode.Model.ProductResponse
import com.example.demofode.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class frag_food_resulth : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_frag_food_resulth, container, false)

        return  view    }

}

