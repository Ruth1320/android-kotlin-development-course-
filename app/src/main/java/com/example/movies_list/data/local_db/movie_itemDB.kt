package com.example.movies_list.data.local_db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ItemDB::class), version = 1, exportSchema = false)
abstract class ItemDB: RoomDatabase() {
    abstract fun movieItemDAO(): ItemDAO

    companion object {

        @Volatile
        private var instance: ItemDB? = null

        fun getDatabase(context: Context) = instance ?: synchronized(this) {
            Room.databaseBuilder(
                context.applicationContext,
                ItemDB::class.java,
                "movie_itemsDB"
            )
                .allowMainThreadQueries().build().also { instance = it }
        }
    }
}