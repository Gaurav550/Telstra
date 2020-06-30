package com.example.kotlinmvvm.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.kotlinmvvm.utils.Constants

//@Entity(tableName = Constants.tableRows)
data class RowModel (
        //@PrimaryKey(autoGenerate = true)
        var rowId: Int,
        val title: String?,
        val description: String?,
        val imageHref: String?
    )
