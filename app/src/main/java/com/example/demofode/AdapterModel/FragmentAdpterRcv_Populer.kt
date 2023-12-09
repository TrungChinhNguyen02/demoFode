package com.example.demofode.AdapterModel

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demofode.Model.Product
import com.example.demofode.R
import com.example.demofode.fragment_special


class FragmentAdpterRcv_Populer(private val ProductList: List<Product>) : RecyclerView.Adapter<FragmentAdpterRcv_Populer.MyViewHolder>(){
   class MyViewHolder(viewItem : View):RecyclerView.ViewHolder(viewItem) {
        private val TAG = "FragmentAdpterRcv_Populer"
        lateinit var tenmon : TextView
        lateinit var gia : TextView
        lateinit var img_avatar : ImageView
        lateinit var calor : TextView
        lateinit var thongtin : TextView
        lateinit var id : RelativeLayout
        lateinit var imgTym : ImageView

        init {
            tenmon =viewItem.findViewById(R.id.ten_mon)
            gia=viewItem.findViewById(R.id.giamon)
            img_avatar = viewItem.findViewById(R.id.img_mon)
            calor = viewItem.findViewById(R.id.calor)
            thongtin = viewItem.findViewById(R.id.thongtin)
            id = viewItem.findViewById(R.id.id_item_chef)
            imgTym = viewItem.findViewById(R.id.tymIcon)

            id.setOnClickListener{
                Log.d(TAG, ": ahiahi ")
            }
            imgTym.setOnClickListener {
                imgTym.setBackgroundResource(R.drawable.icon_tym_red)
            }
        }
       fun bind(item: Product){
           id.gravity = item.id
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
        holder.bind(ProductList[position])
    }
}
