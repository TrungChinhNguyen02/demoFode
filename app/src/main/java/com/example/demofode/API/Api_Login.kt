package com.example.demofode.API

import com.example.demofode.Model.Register_Account
import com.example.demofode.Model.register
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api_Login {

    companion object{

        var retrofit = Retrofit.Builder()
            .baseUrl("http://ec2-13-114-125-145.ap-northeast-1.compute.amazonaws.com/api/")
            .addConverterFactory(GsonConverterFactory.create()).build()
        var apilogin = retrofit.create(Api_Login::class.java)
    }

    @POST("login")
    @FormUrlEncoded
    fun getData(@Field("username") username: String,
                @Field("password") password: String): Call<register>

    @POST("registration")
    fun Register(@Body registerAccount: Register_Account): Call<register>
}