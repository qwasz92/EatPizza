package com.example.eatpizza.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ToppingDao{
    @Query("select*from topping")
    fun getAll():List<Topping>

    @Query("select*from topping where id = :id")
    fun getToppingById(id:Int):Topping

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(topping: Topping)
}