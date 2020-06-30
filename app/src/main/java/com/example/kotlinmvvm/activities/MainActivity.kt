package com.example.kotlinmvvm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.fragments.DataFragment

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: TextView
    lateinit var fragmentMain: Fragment
    val fragmentManager: FragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        fragmentManager.beginTransaction().add(R.id.fragment_main, DataFragment()).commit()
    }

}
