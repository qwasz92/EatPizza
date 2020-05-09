package com.example.eatpizza.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
    interface PizzaDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(pizza: Pizza)

    @Query("select * from pizza")
    fun getAll():List<Pizza>

    @Query("select * from pizza where id = :id")
    fun getPizzaByid(id:Int):Pizza

    @Query("delete from pizza where id = :id")
    fun deletePizzaById(id:Int)
}