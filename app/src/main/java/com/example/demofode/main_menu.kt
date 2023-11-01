package com.example.demofode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demofode.databinding.MainMenuBinding

class main_menu : AppCompatActivity() {
    lateinit var binding: MainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.myProfile.setOnClickListener{
            nextMyProfile()
        }
        binding.logout.setOnClickListener{
            val intent1 = Intent(this@main_menu,activity_login::class.java)
                startActivity(intent1)
        }
    }


    fun nextMyProfile() {
        val  intent = Intent(this@main_menu,myProfile::class.java)
        startActivity(intent)
    }

}