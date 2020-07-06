package com.example.kotlinmvvm.storage.roomDAO

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.utils.Constants


@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(listOfRows: Items)


    @Query("SELECT * from " + Constants.tableName)
    fun getItems(): LiveData<List<Items>>

    @Query("SELECT COUNT(*) FROM " + Constants.tableName)
    fun getRowCount(): LiveData<Int?>?

}