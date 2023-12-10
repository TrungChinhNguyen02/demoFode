package com.example.demofode.PackageFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.demofode.R
import com.example.demofode.fragment_myCard

class fragment_clasicoo : Fragment() {
    val TAG = "fragment_clasicoo"
//    var  gia = 0
//    var tt : String? = null
   private var foodname :String? = null
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Lấy dữ liệu từ argument
        arguments?.let {
            foodname = it.getString("foodName")
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view : View = inflater.inflate(R.layout.fragment_clasicoo, container, false)
//        val txtAdd : TextView = view.findViewById(R.id.text_sum_classico)
//       val btnadd : TextView = view.findViewById(R.id.add_classico)
//        val btnBuyNow : ImageView = view.findViewById(R.id.buynow)
//        val ten : TextView = view.findViewById(R.id.foodname_classico)
//        ten.text = foodname
//
//        btnadd.setOnClickListener{
//            count++
//            txtAdd.text = count.toString()
//        }
//        val btnDeff : TextView = view.findViewById(R.id.difference_classico)
//        btnDeff.setOnClickListener{
//            count--
//            txtAdd.text = count.toString()
//  }
//        btnBuyNow.setOnClickListener {
//            val newFragment = fragment_myCard()
//
//            val transaction = requireActivity().supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.add_fragment, newFragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }
////        getdata()
        return view
    }

}