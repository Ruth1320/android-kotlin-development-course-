package com.example.movies_list.data.local_db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.movies_list.data.models.MovieItem

@Dao
interface ItemDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addItem(movieItem: MovieItem)

    @Update
    fun updateItem(movieItem: MovieItem)

    @Delete
    fun deleteItem(vararg movieItem: MovieItem)

    @Query("SELECT * FROM movies")
    fun getItems(): LiveData<List<MovieItem>>

    @Query("SELECT * FROM movies WHERE id LIKE :id")
    fun getItem(id:Int): MovieItem









}