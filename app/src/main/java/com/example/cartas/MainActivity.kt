package com.example.cartas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cartas.adapter.RecyclearViewAdapter
import com.example.cartas.data.DataSource

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataSource: DataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = DataSource().loadAffirmations()
        recyclerView = findViewById<RecyclerView>(R.id.idCourse)
        val layoutManager = GridLayoutManager(this, 2) // Dos columnas

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclearViewAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
}
