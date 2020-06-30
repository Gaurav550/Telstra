package com.example.kotlinmvvm.repositories

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.interfaces.ItemCallback
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.storage.RoomDB
import com.example.kotlinmvvm.storage.roomDAO.ItemDao

class DatabaseRepository(application: Application) : ItemCallback {
    override fun getItemData(data: LiveData<List<RowModel>>) {
        itemData = data
    }

    private var getDao: ItemDao
    private lateinit var itemData: LiveData<List<RowModel>>


    init {
        val database = RoomDB.getInstance(application)
        getDao = database.getDao()
    }


    fun insertRow(items: Items) {
        InsertData(getDao).execute(items)
    }

    class InsertData(val dao: ItemDao) : AsyncTask<Items, Void, Void>() {

        override fun doInBackground(vararg params: Items): Void? {
            dao.insert(params[0])
            return null;
        }

    }

}