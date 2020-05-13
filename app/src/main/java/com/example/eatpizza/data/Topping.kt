package com.example.eatpizza.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Topping(
    @PrimaryKey
    val id:Int,
    val name:String,
    val drawableName:String
)