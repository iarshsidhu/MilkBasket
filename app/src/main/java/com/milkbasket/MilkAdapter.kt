package com.milkbasket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MilkAdapter(private val context: Context,private val list: List<MilkData>): RecyclerView.Adapter<MilkAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = MyViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.cart_items,parent,false)
        )
        return view
    }

//    fun updateList(milkData: MilkData){
//        list.add(milkData)
//        notifyItemInserted(list.size - 1)
//    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val milkData = list[position]
        holder.textView.text = milkData.name
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView: TextView =itemView.findViewById(R.id.headText)
//        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
}