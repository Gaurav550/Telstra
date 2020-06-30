package com.example.kotlinmvvm.storage.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.kotlinassignment.models.Items

@Entity( tableName = "my_item")
data class ItemsEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "header_title")
    val title: String
)
