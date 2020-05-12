package com.example.eatpizza

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.eatpizza.data.Pizza

class MainAdapter(val launchCreatorActivity: (Int?) -> Unit):RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    val list = mutableListOf<Pizza>()
    inner class ViewHolder (view: View):RecyclerView.ViewHolder(view){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pizza_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size
//    取得list的數量

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.updataView(position)
    }
}