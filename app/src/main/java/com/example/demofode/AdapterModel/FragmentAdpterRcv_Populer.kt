package com.example.demofode.AdapterModel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demofode.Model.Product
import com.example.demofode.PackageFragment.fragment_clasicoo
import com.example.demofode.R
import com.example.demofode.activity_food


class FragmentAdpterRcv_Populer(var ProductList: List<Product>, var mContext: Context)
    : RecyclerView.Adapter<FragmentAdpterRcv_Populer.MyViewHolder>(){
    private val TAG = "FragmentAdpterRcv_Populer"
   class MyViewHolder(viewItem : View):RecyclerView.ViewHolder(viewItem) {

        lateinit var tenmon : TextView
        lateinit var gia : TextView
        lateinit var img_avatar : ImageView
        lateinit var calor : TextView
        lateinit var thongtin : TextView
        lateinit var idLayout : RelativeLayout
        lateinit var imgTym : ImageButton



        private var count = 0

        init {
            tenmon =viewItem.findViewById(R.id.ten_mon)
            gia=viewItem.findViewById(R.id.giamon)
            img_avatar = viewItem.findViewById(R.id.img_mon)
            calor = viewItem.findViewById(R.id.calor)
            thongtin = viewItem.findViewById(R.id.thongtin)
            idLayout = viewItem.findViewById(R.id.id_item_chef)
            imgTym = viewItem.findViewById(R.id.tymIcon)



            imgTym.setOnClickListener {
                if (count ==0) {
                    imgTym.setBackgroundResource(R.drawable.icon_tym_red)
                    count ++
                }
                else{
                    imgTym.setBackgroundResource(R.drawable.icon_tym)
                    count --
                }
            }
            itemView.setOnClickListener{

            }
        }

       fun bind(item: Product){
           idLayout.gravity = item.id
           tenmon.text = item.name
           gia.text = item.price.toString()
           calor.text = item.calories.toString()
           thongtin.text = item.description
           Glide.with(itemView.context).load(item.image_url).into(img_avatar)
       }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  view =LayoutInflater.from(parent.context).inflate(R.layout.item_chef,parent,false)
    return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
      return ProductList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var curren = ProductList[position]

        holder.bind(ProductList[position])

        holder.img_avatar.setOnClickListener {
//            val fragment = fragment_clasicoo()
//            val bundle = Bundle()
//                 bundle.putString("foodName", curren.name)
//                bundle.putString("tt",curren.description)
//            Log.d(TAG, "onBindViewHolder: $bundle ")
//
//            fragment.arguments = bundle
            val intent = Intent(mContext,activity_food::class.java)
            intent.putExtra("namee",curren.name)
            intent.putExtra("gia", curren.price)
            intent.putExtra("thongtin",curren.description)
            intent.putExtra("calor",curren.calories)
            intent.putExtra("image",curren.image_url)
            mContext.startActivity(intent)
        }
//        holder.img_avatar.setOnClickListener {
//        val bundle = Bundle().apply {
//            putString("tenmon",curren.name)
//            putInt("gia",curren.price)
//        }
//        fragment.arguments = bundle
//
//        }
    }
   
}
