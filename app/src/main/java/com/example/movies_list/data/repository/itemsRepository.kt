package com.example.movies_list.data.repository
import android.app.Application
import com.example.movies_list.data.local_db.ItemDAO
import com.example.movies_list.data.local_db.ItemDB
import com.example.movies_list.data.models.MovieItem

class ItemsRepository(application: Application) {

    private var itemDao: ItemDAO?

    init {
        val db = ItemDB.getDatabase(application.applicationContext)
        itemDao = db?.movie_itemDAO()
    }

    fun getItems() = itemDao?.getItems()

    fun addItem(movieItem:MovieItem){
        itemDao?.addItem(movieItem)
    }

    fun deleteItem(movieItem:MovieItem){
        itemDao?.deleteItem(movieItem)
    }
    fun getItem(id: Int):MovieItem? = itemDao?.getItem(id)

    fun updateItem(movieItem: MovieItem) {
        itemDao?.updateItem(movieItem)
    }


}