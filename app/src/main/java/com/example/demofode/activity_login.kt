package com.example.demofode

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demofode.API.Api_Login
import com.example.demofode.Model.AccountLogin
import com.example.demofode.Model.Producget
import com.example.demofode.Model.register
import com.example.demofode.databinding.ActivityLoginBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class activity_login: AppCompatActivity() {
    lateinit var token : String
    lateinit var list: List<AccountLogin>
    lateinit var listt : List<Producget>
    lateinit var putText : InputMethodManager
    val TAG = "activity_login"
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)
        setContentView(binding.root)


        binding.dkiAccout.setOnClickListener{
            val intent =Intent (this,activity_singup::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener{
            callapi()
        }
    }
     fun callapi() {

         val user = AccountLogin( binding.edtTextUser.text.toString().trim(),binding.edtTextPass.text.toString().trim())
             Api_Login.apilogin.getData(user).enqueue(object : Callback<register>{
             override fun onResponse(call: Call<register>, response: Response<register>) {
                 if (response.isSuccessful){

                     Log.d(TAG, "${response} - ${response.code()}" )
                     if(response.code() == 200){
                         val sharedPreference =  getSharedPreferences("token", Context.MODE_PRIVATE)
                         var editor = sharedPreference.edit()
                         editor.putString("token",response.body()?.data?.token)
                         editor.commit()
                         val intentShared = Intent(this@activity_login,main_food::class.java)
                         startActivity(intentShared)
                         Toast.makeText(this@activity_login, "thành công", Toast.LENGTH_SHORT).show()
                         val intent = Intent(this@activity_login,main_food::class.java)
                         startActivity(intent)
                     }
                 }else {
                     Toast.makeText(this@activity_login, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show()
                     binding.edtTextUser.setBackgroundResource(R.drawable.login_user_fail)
                     binding.edtTextPass.setBackgroundResource(R.drawable.login_user_fail)
                 }
             }
            override fun onFailure(call: Call<register>, t: Throwable) {
                Log.d(TAG, "onFailure: ")
            }
        })
    }
}
