package com.example.eatpizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
val PIZZA_ID = "PIZZA_ID"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = pizzaRecyclerView
        recyclerView.layoutManager = LinearLayoutManager (this,LinearLayoutManager.VERTICAL,false)

        val launchCreatorActivity ={ id:Int? ->
            val intent = Intent(this,CreatorActivity::class.java)
            intent.putExtra(PIZZA_ID,id)
            startActivity(intent)
        }
        val myAdapter = MainAdapter(launchCreatorActivity)
        recyclerView.adapter = myAdapter
    }
}
