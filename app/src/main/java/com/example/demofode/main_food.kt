package com.example.demofode

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.demofode.PackageFragment.frag_food_resulth
import com.example.demofode.databinding.ActivityMainFoodBinding
import com.google.android.material.navigation.NavigationBarView

class main_food : AppCompatActivity() {
    var show = 0
    lateinit var binding: ActivityMainFoodBinding
    val TAG ="main_food"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val cardview : CardView = binding.cardview
        replaceFragent(fragment_home_food())
        binding.navigationBar.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home_menu ->{replaceFragent(fragment_home_food())
                    cardview.visibility =View.VISIBLE
                    binding.thucan.text = " Thức Ăn"
                }
                R.id.notification_menu ->{
                    binding.thucan.text = " Thông Báo"
                    cardview.visibility =View.GONE
                    replaceFragent(fragment_notification_menu())
                }
                R.id.star_menu ->{
                    binding.thucan.text = "Yêu Thích"
                    cardview.visibility =View.VISIBLE
                    replaceFragent(fragment_star_menu())
                }
                R.id.search_menu ->{
                    binding.thucan.text = "Tìm Kiếm"
                    cardview.visibility =View.VISIBLE
                    replaceFragent(frag_food_resulth())
                }
                R.id.myprofile_menu ->   {
                    binding.thucan.text = " Hồ Sơ Của Tôi"
                    cardview.visibility =View.GONE
                    replaceFragent(fragment_myprofile_menu())
                }
            }

            true
        }
        binding.btnSeach.setOnClickListener {
            val intent = Intent(this@main_food,activity_food::class.java)
            startActivity(intent)
        }
        binding.filterby.setOnClickListener {
            val intent = Intent(this@main_food,food_filter::class.java)
            startActivity(intent)
        }
    }
    private fun replaceFragent(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.cardviewId,fragment)
        fragmentTransaction.commit()
    }
}