package com.example.callback

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview:RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var Adapter:SettingsAdapter
    lateinit var listitem:MutableList<Settingsitems>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview=findViewById(R.id.recyclerview)
        layoutManager=LinearLayoutManager(this)

        createsettngsitems()
        Adapter =SettingsAdapter(listitem)
        recyclerview.adapter=Adapter
        recyclerview.layoutManager=layoutManager

    }
    private fun createsettngsitems() {
        listitem = mutableListOf()
        for (i in 0..165) {
            listitem.add(
                Settingsitems(
                    username = "person num" + i,
                    contentpost = "qwertyuweryuertyu $i+1000",
                    timeshare = "hrs" + (i + 1235),
                    post =R.drawable.qwer

                )
            )
        }

    }}
