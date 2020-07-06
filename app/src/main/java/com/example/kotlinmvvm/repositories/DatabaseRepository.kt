package com.example.kotlinmvvm.repositories

import android.app.Application
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.storage.RoomDB
import com.example.kotlinmvvm.storage.roomDAO.ItemDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class DatabaseRepository(application: Application) : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private var itemDao: ItemDao?

    init {
        val db = RoomDB.getInstance(application)
        itemDao = db.getDao()
    }

    //INSERTION
    fun insertItem(item: Items) {
        launch { insertData(item) }
    }

    private suspend fun insertData(item: Items) {
        withContext(Dispatchers.IO) {
            itemDao?.insert(item)
        }
    }

    fun getItems() = itemDao?.getItems()
    fun getRowCount() = itemDao?.getRowCount()

}