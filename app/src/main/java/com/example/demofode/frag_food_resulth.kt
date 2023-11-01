package com.example.demofode

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demofode.API.Api_GetAll
import com.example.demofode.AdapterModel.FragmentAdpterRcv_Populer
import com.example.demofode.AdapterModel.ViewPagerAdapter
import com.example.demofode.AdapterModel.adapterFragCampai
import com.example.demofode.Model.Product
import com.example.demofode.Model.ProductResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [frag_food_resulth.newInstance] factory method to
 * create an instance of this fragment.
 */
class frag_food_resulth : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_frag_food_resulth, container, false)

        return  view
    }

}