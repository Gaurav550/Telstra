package com.example.kotlinmvvm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.fragments.DataFragment
import com.example.kotlinmvvm.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: TextView
    private lateinit var viewmodel: MainActivityViewModel
    val fragmentManager: FragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        viewmodel.title().observe(this, Observer {
            toolbar.text = it
        })
    }

    private fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        fragmentManager.beginTransaction().add(R.id.fragment_main, DataFragment()).commit()
        viewmodel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
    }

}
