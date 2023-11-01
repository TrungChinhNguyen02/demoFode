package com.example.demofode.AdapterModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demofode.Model.monan
import com.example.demofode.R


class FragmentAdpterRcv_Populer(var mdata :List<monan> = ArrayList()) : RecyclerView.Adapter<FragmentAdpterRcv_Populer.MyViewHolder>(){
    class MyViewHolder(viewItem : View):RecyclerView.ViewHolder(viewItem) {
        lateinit var tenmon : TextView
        lateinit var gia : TextView
        lateinit var img_avatar : ImageView
        init {
            tenmon =viewItem.findViewById(R.id.ten_mon)
            gia=viewItem.findViewById(R.id.giamon)
            img_avatar = viewItem.findViewById(R.id.img_mon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  view =LayoutInflater.from(parent.context).inflate(R.layout.item_chef,parent,false)
    return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
      return mdata.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val obmon = mdata[position]
        holder.tenmon.text = obmon.tenmon
        holder.gia.text= obmon.gia
        holder.img_avatar.setImageResource(obmon.avatar)
    }

}