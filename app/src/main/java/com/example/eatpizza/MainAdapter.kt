package com.example.eatpizza

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.eatpizza.data.Pizza
import kotlinx.android.synthetic.main.pizza_row.view.*
import kotlinx.android.synthetic.main.topping_row.view.*

class MainAdapter(val launchCreatorActivity:(Int?) ->Unit):RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    val list = mutableListOf<Pizza>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.pizza_row,parent,false))
    }
    override fun getItemCount(): Int {
        return list.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.updateView(position)
    }

    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
        var textView = view.tv_name
        var button = view.button
        var divider = view.divider
        fun updateView(index:Int){
            if (index != list.size){
                textView.visibility = View.VISIBLE
                button.visibility = View.GONE
                divider.visibility = View.VISIBLE

                textView.text = list[index].name
                view.setOnClickListener {
                    launchCreatorActivity(list[index].id)
                }
            }else{
                textView.visibility = View.GONE
                button.visibility =View.VISIBLE
                divider.visibility = View.GONE

                button.setOnClickListener { launchCreatorActivity(null) }
            }
        }
}
}