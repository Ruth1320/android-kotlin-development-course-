package com.example.movies_list.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.movies_list.data.models.MovieItem
import com.example.movies_list.data.repository.ItemsRepository

class ItemsViewModel(application: Application):AndroidViewModel(application){

    private val repository = ItemsRepository(application)

    val items: LiveData<List<MovieItem>>? = repository.getItems()

    fun addItem(movieItem: MovieItem){
        repository.addItem(movieItem)
    }
    fun deleteItem(movieItem: MovieItem){
        repository.deleteItem(movieItem)
    }
    fun updateItem(movieItem: MovieItem){
        repository.updateItem(movieItem)
    }
















}