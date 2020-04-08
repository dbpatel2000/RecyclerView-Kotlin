package com.devarsh.kotlin.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listData = RecyclerViewObjectData.getData()

        recyclerview.layoutManager = LinearLayoutManager(this)
        var mAdapter = RecyclerViewAdapter()
        mAdapter.listData = listData
        recyclerview.adapter = mAdapter


    }
}
