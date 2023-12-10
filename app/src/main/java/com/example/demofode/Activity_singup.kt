package com.example.demofode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.demofode.API.Api_Login
import com.example.demofode.Model.Register_Account
import com.example.demofode.Model.register
import com.example.demofode.databinding.ActivitySingupBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class activity_singup : AppCompatActivity() {
    lateinit var binding: ActivitySingupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySingupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSingup.setOnClickListener {
            var tk = binding.email.text.toString()
            var email = binding.userUp.text.toString()
            var sdt = binding.phoneNumber.text.toString()
            var mk = binding.passSingup.text.toString()

            var regis = Register_Account(email.trim(), mk.trim(), sdt.trim(), tk.trim())
            Api_Login.apilogin.Register(regis).enqueue(object : Callback<register> {
                override fun onResponse(call: Call<register>, response: Response<register>) {
                    if (response.isSuccessful){
                        Toast.makeText(this@activity_singup, "Đăng kí thành công", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@activity_singup, activity_login::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@activity_singup, "thất bại", Toast.LENGTH_SHORT).show()
                        Log.d("checkapi", "onResponse: ${response}")
                    }
                }
                override fun onFailure(call: Call<register>, t: Throwable) {
                    Toast.makeText(this@activity_singup, "Đã xảy ra lỗi", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}
