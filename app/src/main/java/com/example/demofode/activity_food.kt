package com.example.demofode


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.demofode.PackageFragment.frag_food_resulth


import com.example.demofode.databinding.ActivityFoodBinding

class activity_food : AppCompatActivity() {
    lateinit var binding: ActivityFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_food)
        setContentView(binding.root)


        val fragmentManager = supportFragmentManager
// Begin a FragmentTransaction
        val fragmentTransaction = fragmentManager.beginTransaction()

// Create an instance of the fragment you want to add
        val myFragment = frag_food_resulth()

// Add the fragment to the layout
        fragmentTransaction.add(R.id.add_fragment, myFragment)

// Commit the transaction
        fragmentTransaction.commit()
    }

}