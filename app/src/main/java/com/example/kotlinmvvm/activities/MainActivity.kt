package com.example.kotlinmvvm.activities

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.fragments.DataFragment
import com.example.kotlinmvvm.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: TextView
    private lateinit var viewmodel: MainActivityViewModel
    private val fragmentManager: FragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        if (isNetworkAvailable(this)) {
            viewmodel.title().observe(this, Observer {
                toolbar.text = it
            })
        } else {
            updateData()
        }
    }

    private fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        fragmentManager.beginTransaction().add(R.id.fragment_main, DataFragment()).commit()
        viewmodel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val capabilities =
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        if (capabilities != null) {
            if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                return true
            } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                return true
            }
        }
        return false
    }


    private fun updateData() {
        viewmodel.getRowCount()
            ?.observe(this, androidx.lifecycle.Observer {
                if (it != null && it > 0) {
                    viewmodel.getItems()?.observe(this, Observer<List<Items>> { itemList ->

                        toolbar.text = itemList[0].title

                    })
                } else {
                    Toast.makeText(this, "No Data available", Toast.LENGTH_LONG).show()
                }
            })
    }
}