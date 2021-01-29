package com.example.aad_learning.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aad_learning.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val RC_add = 30
        val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val adapter = DrinkPickerViewAdapter()
        pager.adapter = adapter

    }
}