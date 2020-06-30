package com.example.kotlinmvvm.storage.roomDAO

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.storage.RoomDB
import com.example.kotlinmvvm.utils.Constants


@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(listOfRows: Items)

//    @Query("SELECT * from "+ Constants.tableRows)
//    fun getItemsRows() : LiveData<List<RowModel>>
}