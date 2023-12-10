package com.example.demofode.API

import com.example.demofode.Model.ProductGetResponse
import com.example.demofode.Model.ProductResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header

interface Api_GetAll {
    companion object{

        var retrofit = Retrofit.Builder()
            .baseUrl("http://ec2-13-114-125-145.ap-northeast-1.compute.amazonaws.com/api/")
            .addConverterFactory(GsonConverterFactory.create()).build()
        var apiGetall = retrofit.create(Api_GetAll::class.java)
    }

    @GET("product/get-all")
fun getAllProducts(@Header("Authorization") token : String) : Call<ProductResponse>

    @GET("product/get/1")
    fun getProduct(@Header("Authorization") token : String) : Call<ProductGetResponse>
}