package com.example.kotlinmvvm.repositories

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.interfaces.RetrofitService
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.singletons.RetrofitObject
import retrofit2.Callback
import retrofit2.Response

class MainActivityRepository {

    private var myItemData = MutableLiveData<MutableList<RowModel>>()
    private var headerItem = MutableLiveData<Items>()
    private var title: MutableLiveData<String> = MutableLiveData<String>()

    fun getDataFromApi(): LiveData<MutableList<RowModel>> {
        RetrofitObject.retrofitInstance.create(RetrofitService::class.java).getData()
            .enqueue(object :
                Callback<Items> {

                override fun onResponse(call: retrofit2.Call<Items>, response: Response<Items>) {

                    // will be wxecutes only if the rows is not null
                    response.body()?.let {
                        headerItem.value = it
                        myItemData.value = it.rows
                        title.value = headerItem.value?.title
                        print("on response called")
                    }
                }

                override fun onFailure(call: retrofit2.Call<Items>, t: Throwable) {

                    print("on failuire called")
                }

            })
        return myItemData
    }

    fun getApiItemns(): LiveData<Items> {
        return headerItem
    }
    fun getTitle():MutableLiveData<String>{

        return title
    }
}