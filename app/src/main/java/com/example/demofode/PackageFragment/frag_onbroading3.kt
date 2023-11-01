package com.example.demofode.PackageFragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.demofode.R
import com.example.demofode.activity_login

class frag_onbroading3 : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view : View =inflater.inflate(R.layout.fragment_frag_onbroading3, container, false)
        val btnnextfrag3 : Button = view.findViewById(R.id.next_fragment3)
        btnnextfrag3.setOnClickListener{
           val intent = Intent(requireContext(), activity_login::class.java)
            startActivity(intent)
        }
        return view
    }

}