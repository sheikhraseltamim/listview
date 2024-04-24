package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    val users = arrayOf(
        "mushfiqur Rahim",
        "Sakib Al Hasan",
        "Mahmudullah Riad",
        "Tamim Iqbal",
        "masrafi Bin Mortaza",
        "Liton Das",
        "Nazmul Hossain Santo",
        "taskin Ahmed",
        "Mostafizur Rahman",
        "Rubel Hossain",
        "Mominul Haque",
        "Risad HOssain",
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.ListView)
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,users)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "clicked Item"+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show()
        }
    }
}