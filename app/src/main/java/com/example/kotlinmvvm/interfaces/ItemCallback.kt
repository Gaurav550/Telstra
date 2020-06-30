package com.example.kotlinmvvm.interfaces

import androidx.lifecycle.LiveData
import com.example.kotlinmvvm.models.RowModel

interface ItemCallback {
    fun getItemData(data: LiveData<List<RowModel>>)
}