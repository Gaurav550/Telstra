package com.example.kotlinmvvm.interfaces

import com.example.kotlinassignment.models.Items
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("s/2iodh4vg0eortkl/facts.json")
    fun getData(): Call<Items>
}