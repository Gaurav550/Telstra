package com.example.kotlinmvvm.singletons

import com.example.kotlinmvvm.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {
    var retrofitInstance: Retrofit
         = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL).build()

}