package com.example.demofode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demofode.databinding.MainMyprofileBinding

class myProfile: AppCompatActivity() {
    lateinit var binding: MainMyprofileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainMyprofileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}