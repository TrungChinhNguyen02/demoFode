package com.example.demofode

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class fragment_myCard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_my_card, container, false)
        val btnbuy : ImageButton
        btnbuy = view.findViewById(R.id.buynow)
        btnbuy.setOnClickListener {
            val intent = Intent(view.context,activity_maps::class.java)
            view.context.startActivity(intent)
        }

        return view
    }

}