package com.example.eatpizza.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity
class Pizza(    @PrimaryKey(autoGenerate = true)
                var id:Int?,
                val name:String
){
}