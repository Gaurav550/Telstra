package com.example.kotlinmvvm.storage.roomDAO

import androidx.room.*
import com.example.kotlinassignment.models.Items



@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(listOfRows: Items)

}