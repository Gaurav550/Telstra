package com.example.kotlinmvvm.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.repositories.DatabaseRepository
import com.example.kotlinmvvm.repositories.MainActivityRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private var databaseRepository: DatabaseRepository =  DatabaseRepository(application)
    private var mainActivityRepository: MainActivityRepository = MainActivityRepository()

    fun getRepoData() =
        mainActivityRepository.getDataFromApi()


    fun getApiData() = mainActivityRepository.getApiItems()

    fun saveData(items: Items) {
        databaseRepository.insertItem(items)
    }

    fun getItems() = databaseRepository.getItems()
    fun getRowCount() = databaseRepository.getRowCount()

    fun title() = mainActivityRepository.getTitle()


}