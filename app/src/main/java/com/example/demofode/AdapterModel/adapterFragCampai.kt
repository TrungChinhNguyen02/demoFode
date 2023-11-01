package com.example.demofode.AdapterModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demofode.Model.Products
import com.example.demofode.R

class adapterFragCampai(private val ProductList: List<Products>): RecyclerView.Adapter<adapterFragCampai.ViewHolder>() {
    class ViewHolder(viewItem : View):RecyclerView.ViewHolder(viewItem) {
        lateinit var nameSale : TextView
        lateinit var priceBefor :TextView
        lateinit var priceAfter : TextView
        lateinit var imgchef : ImageView
        init {
            nameSale = viewItem.findViewById(R.id.txt_sale)
            priceBefor = viewItem.findViewById(R.id.befor_sale)
            priceAfter =  viewItem.findViewById(R.id.after_sale)
            imgchef = viewItem.findViewById(R.id.img_campai)

        }
        fun bind(item : Products){
            nameSale.text = item.name
            priceAfter.text = item.price.toString()
            priceBefor.text = item.price.toString()
            Glide.with(itemView.context).load(item.image_url).into(imgchef)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.campaigns_item,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return ProductList.size
    }
    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
       holder.bind(ProductList[position])
    }


}