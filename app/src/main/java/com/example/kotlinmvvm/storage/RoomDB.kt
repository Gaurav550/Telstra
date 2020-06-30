package com.example.kotlinmvvm.storage

import android.app.Application
import androidx.room.*
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.storage.roomDAO.ItemDao
import com.example.kotlinmvvm.utils.TypeConverterDB

@Database(entities = [Items::class], version = 3)
@TypeConverters(TypeConverterDB::class)
abstract class RoomDB : RoomDatabase() {

    abstract fun getDao(): ItemDao

    companion object {
        lateinit var dbInstance: RoomDB

        fun getInstance(context: Application): RoomDB {
            dbInstance = Room.databaseBuilder(
                context,
                RoomDB::class.java,
                "database_item"
            )
                .fallbackToDestructiveMigration()
                .build()
            return dbInstance
        }
    }

}