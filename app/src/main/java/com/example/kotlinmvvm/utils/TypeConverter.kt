package com.example.kotlinmvvm.utils

import androidx.room.TypeConverter
import com.example.kotlinmvvm.models.RowModel
import com.google.gson.Gson


class TypeConverterDB {

//    @TypeConverter
//    fun arrayToString(list: MutableList<RowModel>): String {
//        val gson = Gson()
//        return gson.toJson(list)
//    }
    @TypeConverter
    fun listToJson(value: List<RowModel>?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<RowModel>::class.java).toList()

}