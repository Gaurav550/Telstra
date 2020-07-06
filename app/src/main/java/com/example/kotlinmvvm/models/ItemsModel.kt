package com.example.kotlinassignment.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.utils.Constants

@Entity(tableName = Constants.tableName)
data class Items(
    @PrimaryKey(autoGenerate = true)
    var itemId: Int,
    val title: String,
    val rows: ArrayList<RowModel>
)
