package com.example.demofode.PackageFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demofode.API.Api_GetAll
import com.example.demofode.AdapterModel.adapterFragCampai
import com.example.demofode.Model.ProductGetResponse
import com.example.demofode.Model.Products
import com.example.demofode.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class frag_campai : Fragment() {
    private val TAG = "frag_campai"
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapterFragCampaii: adapterFragCampai
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view : View = inflater.inflate(R.layout.fragment_campai, container, false)
      getDataProductAll()
        return view
    }
    private fun setupRecyclerView(productList: List<Products>) {
        recyclerView = view?.findViewById(R.id.recycleviewtab)!!
        adapterFragCampaii = adapterFragCampai(productList)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapterFragCampaii
    }
    private fun getDataProductAll(){

        val sharedPreferences = requireContext().getSharedPreferences("appFode",
            Context.MODE_PRIVATE
        )
        val token = sharedPreferences.getString("token","")

        Log.d("fragment_special", "getallProduc: $token")
        Api_GetAll.apiGetall.getProduct("Bearer " + token).enqueue(object :
            Callback<ProductGetResponse> {
            override fun onResponse(
                call: Call<ProductGetResponse>,
                response: Response<ProductGetResponse>
            ) {
                if (response.isSuccessful) {
                    Log.d(TAG, "onResponse: ${response.body()?.data.toString()}")
                }
                else{
                    Log.d(TAG, "onResponse: error ${response.code()}")
                }
            }
            override fun onFailure(call: Call<ProductGetResponse>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}