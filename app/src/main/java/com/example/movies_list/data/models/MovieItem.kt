package com.example.movies_list.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Movies")
data class MovieItem (val title: String, val overview: String, val photo: String?, val releaseYear: Int, val rating: Int){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
