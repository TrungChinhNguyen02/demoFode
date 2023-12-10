package com.example.demofode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.demofode.API.OnButtonClickListener
import com.example.demofode.databinding.ActivityFoodFilterBinding

class food_filter : AppCompatActivity() {
    lateinit var binding: ActivityFoodFilterBinding
    private var dem = 0
    private var dem1 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodFilterBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_food_filter)
        setContentView(binding.root)

        binding.btnApplyFilter.setOnClickListener {
            val intent = Intent(this@food_filter,main_food::class.java)
            startActivity(intent)
        }
        val mitom =  binding.mitom
        val pluss = binding.pluss
        val drink = binding.drink
        mitom.setOnClickListener{

            mitom.setBackgroundResource(R.drawable.btnfilter_fode)
            drink.setBackgroundResource(R.drawable.button_filter)
            pluss.setBackgroundResource(R.drawable.button_filter)

        }
 
            drink.setOnClickListener {

                drink.setBackgroundResource(R.drawable.btnfilter_fode)
                mitom.setBackgroundResource(R.drawable.button_filter)
                pluss.setBackgroundResource(R.drawable.button_filter)

        }

        pluss.setOnClickListener {

            pluss.setBackgroundResource(R.drawable.btnfilter_fode)
            mitom.setBackgroundResource(R.drawable.button_filter)
            drink.setBackgroundResource(R.drawable.button_filter)

        }
        val filter1 = binding.filte1
        val filter2 = binding.filte2
        val filter3 = binding.filte3
        val filter4 = binding.filte4
        val filter5 = binding.filte5
        val filter6 = binding.filte6


        val onClickListener = View.OnClickListener { view ->
            filter1.setBackgroundResource(R.drawable.view_local)
            filter2.setBackgroundResource(R.drawable.view_local)
            filter3.setBackgroundResource(R.drawable.view_local)
            filter4.setBackgroundResource(R.drawable.view_local)
            filter5.setBackgroundResource(R.drawable.view_local)
            filter6.setBackgroundResource(R.drawable.view_local)
            when (view.id){


                R.id.filte1 ->  filter1.setBackgroundResource(R.drawable.view_local_click)
                R.id.filte2 ->  filter2.setBackgroundResource(R.drawable.view_local_click)
                R.id.filte3 ->  filter3.setBackgroundResource(R.drawable.view_local_click)
                R.id.filte4 ->  filter4.setBackgroundResource(R.drawable.view_local_click)
                R.id.filte5 ->  filter5.setBackgroundResource(R.drawable.view_local_click)
                R.id.filte6 ->  filter6.setBackgroundResource(R.drawable.view_local_click)
            }
        }
        filter1.setOnClickListener(onClickListener)
        filter2.setOnClickListener(onClickListener)
        filter3.setOnClickListener(onClickListener)
        filter4.setOnClickListener(onClickListener)
        filter5.setOnClickListener(onClickListener)
        filter6.setOnClickListener(onClickListener)
        val local1 = binding.local1
        val local2 = binding.local2
        val local3 = binding.local3
        val local4 = binding.local4
        val local5 = binding.local5
        val local6 = binding.local6

        val onClickListener1 = View.OnClickListener { view ->
            local1.setBackgroundResource(R.drawable.view_local)
            local2.setBackgroundResource(R.drawable.view_local)
            local3.setBackgroundResource(R.drawable.view_local)
            local4.setBackgroundResource(R.drawable.view_local)
            local5.setBackgroundResource(R.drawable.view_local)
            local6.setBackgroundResource(R.drawable.view_local)
            when (view.id){
                R.id.local1 ->  local1.setBackgroundResource(R.drawable.view_local_click)
                R.id.local2 ->  local2.setBackgroundResource(R.drawable.view_local_click)
                R.id.local3 ->  local3.setBackgroundResource(R.drawable.view_local_click)
                R.id.local4 ->  local4.setBackgroundResource(R.drawable.view_local_click)
                R.id.local5 ->  local5.setBackgroundResource(R.drawable.view_local_click)
                R.id.local6 ->  local6.setBackgroundResource(R.drawable.view_local_click)
            }
        }
        local1.setOnClickListener(onClickListener1)
        local2.setOnClickListener(onClickListener1)
        local3.setOnClickListener(onClickListener1)
        local4.setOnClickListener(onClickListener1)
        local5.setOnClickListener(onClickListener1)
        local6.setOnClickListener(onClickListener1)
    }

}

