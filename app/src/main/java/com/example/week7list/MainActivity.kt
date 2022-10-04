package com.example.week7list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// create a recycler view list which gives all the numbers in a list
// Next add option menu which gives options to lengths for a list

// new app:
// create a new list which shows information about some books with the icon and title and raiting
// Get 10 rows of test data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberList = findViewById<RecyclerView>(R.id.numberlist)
        val data = IntArray(100){it}.filter { it % 3 ==0 || it % 5 == 0 }

        numberList.adapter =  numberadapter(data) // takes the data and converts that to be a row to be displayed on the screen
        numberList.layoutManager = LinearLayoutManager(this)
    }
}