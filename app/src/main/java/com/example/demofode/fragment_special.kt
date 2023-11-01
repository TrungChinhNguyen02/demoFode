package com.example.demofode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demofode.AdapterModel.FragmentAdpterRcv_Populer
import com.example.demofode.Model.monan
import com.example.demofode.databinding.FragmentSpecialBinding



/**
 * A simple [Fragment] subclass.
 * Use the [fragment_special.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_special : Fragment() {

    private lateinit var adapterr: FragmentAdpterRcv_Populer
    private lateinit var mRecyclerView : RecyclerView
    var mMonanList: ArrayList<monan> = ArrayList()

    lateinit var binding: FragmentSpecialBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))
        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))
        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))
        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))
        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))
        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))
        mMonanList.add(monan("thịt gà","100$",R.drawable.image_pizza))

        val view =inflater.inflate(R.layout.fragment_special, container, false)

        mRecyclerView = view.findViewById(R.id.recycleviewtab)
        adapterr = FragmentAdpterRcv_Populer(mMonanList)
        mRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL ,false)
        mRecyclerView.adapter = adapterr
        return view
    }
}