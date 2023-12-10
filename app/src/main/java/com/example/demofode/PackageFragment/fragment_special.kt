package com.example.demofode.PackageFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demofode.API.Api_GetAll.Companion.apiGetall
import com.example.demofode.AdapterModel.FragmentAdpterRcv_Populer
import com.example.demofode.Model.Product
import com.example.demofode.Model.ProductResponse
import com.example.demofode.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 * Use the [fragment_special.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_special : Fragment() {
//    lateinit var sharedPreferences: SharedPreferences
//
    private lateinit var adapterr: FragmentAdpterRcv_Populer
    private lateinit var mRecyclerView : RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =inflater.inflate(R.layout.fragment_special, container, false)


        getDataProductAll()
        return view
    }
    private fun setupRecyclerView(productList: List<Product>) {
        mRecyclerView = view?.findViewById(R.id.recycleviewSpecial)!!
        adapterr = FragmentAdpterRcv_Populer(productList,requireContext())
        mRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        mRecyclerView.adapter = adapterr
    }
        private fun getDataProductAll(){

            val sharedPreferences = requireContext().getSharedPreferences("appFode", Context.MODE_PRIVATE)
            val token = sharedPreferences.getString("token","")

            Log.d("fragment_special", "getallProduc: $token")
            apiGetall.getAllProducts("Bearer " + token).enqueue(object : Callback <ProductResponse>{
                override fun onResponse(
                    call: Call<ProductResponse>,
                    response: Response<ProductResponse>
                ) {
                    if (response.isSuccessful){
                        val productResponse : ProductResponse? = response.body()
                        val productList: List<Product>? = productResponse?.data?.products
                        if (productList != null) {
                            setupRecyclerView(productList)
                        }
                    }
                }
                override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                    t.printStackTrace()
                }
            })
        }
}
