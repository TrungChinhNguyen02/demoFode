package com.example.demofode


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.demofode.Model.paymentModel
import com.example.demofode.databinding.ActivityFoodBinding

class activity_food : AppCompatActivity() {
    val liveData = MutableLiveData<String>()
    private lateinit var paymentmodell: paymentModel
    val TAG = "activity_food"
    lateinit var binding: ActivityFoodBinding
    var foodname : String? = null
    var giaclas = 10
    var calorcals = 0
    var tt : String? = null
    var imageclas :String? = null
    var pSize = 0
    var total = 0
    var solong1 = 1
    var size :String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_food)
        setContentView(binding.root)

        paymentmodell = ViewModelProvider(this).get(paymentModel::class.java)


        liveData.observe(this,{
            totalLive -> binding.tongtien.text = "$totalLive$"
        })
        showdata()
        soluong()
        selectSize()

    }

    fun selectSize(){
        val buttonList = arrayOf(binding.sizel, binding.sizes, binding.sizem)
        var selectedButton: Button? = null
        for (button in buttonList) {
            button.setOnClickListener {
                if (selectedButton != null) {
                    selectedButton!!.setBackgroundColor(Color.parseColor("#FFFFFF"))
                }
                button.setBackgroundColor(Color.parseColor("#F8D57E"))
                selectedButton = button
                size = button.text.toString()
                totalFood()
                Log.d(TAG, "selectSize: $pSize")
            }

        }
    }

    fun totalFood(){
        total = if (size == "M"){
            giaclas * solong1
         }
        else (if ( size == "S"){
            (giaclas + 5) * solong1
        } else{
            (giaclas +10)*solong1
        }) as Int
        liveData.value = total.toString()
    }



    fun soluong(){
        binding.add.setOnClickListener {
            solong1++
            binding.textSum.text = solong1.toString()
        totalFood()
        }
        binding.difference.setOnClickListener{
            if (solong1> 1){
                solong1--
            }
            binding.textSum.text = solong1.toString()
            totalFood()
        }
    }
    fun showdata(){
        foodname = intent.getStringExtra("namee")
//        giaclas = intent.getIntExtra("gia",0)
        calorcals = intent.getIntExtra("calor",0)
        tt = intent.getStringExtra("thongtin")
        imageclas = intent.getStringExtra("image")
        binding.foodnameClassico.text = foodname
        binding.calorClasicoo.text= "$calorcals calories"
        binding.descriptionClasicoo.text = tt
        binding.priceClassico.text = "$giaclas$"
        Glide.with(this).load(imageclas).into(binding.imgChefClassico)
    }
    fun payNow (){
        binding.buynow.setOnClickListener {
            val intent = Intent (this,activity_maps::class.java)
            intent.putExtra("ten",foodname)
            intent.putExtra("gia",total)
        }
    }


}