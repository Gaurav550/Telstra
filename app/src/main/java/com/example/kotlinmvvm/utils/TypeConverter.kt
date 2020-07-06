package com.example.kotlinmvvm.utils

import androidx.room.TypeConverter
import com.example.kotlinmvvm.models.RowModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.ArrayList


class TypeConverterDB {

    @TypeConverter
    fun fromString(value: String): ArrayList<RowModel>? {
        val listType = object : TypeToken<ArrayList<RowModel>>() {

        }.type
        return Gson().fromJson<ArrayList<RowModel>>(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<RowModel>): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}