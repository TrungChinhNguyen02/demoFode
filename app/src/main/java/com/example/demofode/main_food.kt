package com.example.demofode

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.demofode.API.Api_GetAll
import com.example.demofode.AdapterModel.FragmenAdapterTab
import com.example.demofode.Model.Producget
import com.example.demofode.Model.dataToken
import com.example.demofode.databinding.ActivityMainFoodBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class main_food : AppCompatActivity() {
    lateinit var binding: ActivityMainFoodBinding
        val TAG ="main_food"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pager2food= binding.page2Food
        val tabfood = binding.tabFood
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
        getProduc()

    }
    private fun getProduc() {
        val sharedPreferences = getSharedPreferences("token",Context.MODE_PRIVATE)
        val token = sharedPreferences.getString("token",null)
        val intent = Intent(this,main_food::class.java)
        intent.getStringExtra("token")

        Api_GetAll.apiGetall.Produc("Bearer $intent").enqueue( object :Callback<List<Producget>>{
            override fun onResponse(
                call: Call<List<Producget>>,
                response: Response<List<Producget>>
            ) {
               if (response.code() ==200){
                   Toast.makeText(this@main_food, "thành cônggg", Toast.LENGTH_SHORT).show()
               }
                else{
                   Toast.makeText(this@main_food, "thất bại", Toast.LENGTH_SHORT).show()}
            }

            override fun onFailure(call: Call<List<Producget>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}