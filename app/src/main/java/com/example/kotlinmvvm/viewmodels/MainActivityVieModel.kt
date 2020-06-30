package com.example.kotlinmvvm.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.repositories.DatabaseRepository
import com.example.kotlinmvvm.repositories.MainActivityRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private var databaseRepository: DatabaseRepository
    private var mainActivityRepository: MainActivityRepository

    init {
        databaseRepository = DatabaseRepository(application)
        mainActivityRepository = MainActivityRepository()
    }

    fun getRepoData() =
        mainActivityRepository.getDataFromApi()


    fun getApiData()  = mainActivityRepository.getApiItemns()

    fun saveData(items : Items) {
            databaseRepository.insertRow(items)
    }

    fun title() = mainActivityRepository.getTitle()


}