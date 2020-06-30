package com.example.kotlinmvvm.repositories

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.interfaces.ItemCallback
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.storage.RoomDB
import com.example.kotlinmvvm.storage.roomDAO.ItemDao

class DatabaseRepository(var application: Application) : ItemCallback {
    override fun getItemData(data: LiveData<List<RowModel>>) {
        itemData = data
    }

    private var database: RoomDB
    private var getDao: ItemDao
    private lateinit var itemData: LiveData<List<RowModel>>


    init {
        database = RoomDB.getInstance(application)
        getDao = database.getDao()
    }


    fun insertRow(items: Items) {
        InsertData(getDao).execute(items)
    }

//    fun getRows():LiveData<List<RowModel>> {
//        GetListdata(getDao, this).execute()
//        return itemData
//    }

    class InsertData(val dao: ItemDao) : AsyncTask<Items, Void, Void>() {

        override fun doInBackground(vararg params: Items): Void? {
            dao.insert(params[0])
            return null;
        }

    }

//    class GetListdata(val dao: ItemDao, val itemCallback: ItemCallback) :
//        AsyncTask<Void, Void, LiveData<List<RowModel>>>() {
//        override fun doInBackground(vararg params: Void?): LiveData<List<RowModel>> {
//            return dao.getItemsRows()
//        }
//
//        override fun onPostExecute(result: LiveData<List<RowModel>>?) {
//            super.onPostExecute(result)
//
//            result?.let {
//                itemCallback.getItemData(it)
//            }
//        }


    //}
}