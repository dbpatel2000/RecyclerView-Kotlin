package com.devarsh.kotlin.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_recyclerview_item.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.Holder>(){

    var listData : MutableList<RecyclerViewDataClass> = mutableListOf();

    fun submitData(data : MutableList<RecyclerViewDataClass>){
        this.listData = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.activity_recyclerview_item, parent, false)
        var viewHolder = Holder(view);
        return viewHolder;
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.recyclerview_item_title.text = listData.get(position).title
        holder.itemView.recyclerview_item_text.text = listData.get(position).text
        Glide.with(holder.itemView)
            .load(listData.get(position).image)
            .into(holder.itemView.recyclerview_item_image)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
    }

}
