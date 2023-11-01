package com.example.demofode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class fragment_clasicoo : Fragment() {
    private var count = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_clasicoo, container, false)
        val txtAdd : TextView = view.findViewById(R.id.text_sum_classico)
       val btnadd : TextView = view.findViewById(R.id.add_classico)
        btnadd.setOnClickListener{
            count++
            txtAdd.text = count.toString()
            Toast.makeText(context, "hello $count", Toast.LENGTH_SHORT).show()

        }
        val btnDeff : TextView = view.findViewById(R.id.difference_classico)
        btnDeff.setOnClickListener{
            count--
            txtAdd.text = count.toString()
            Toast.makeText(context, "hello $count", Toast.LENGTH_SHORT).show()
        }
        return view
    }

}

