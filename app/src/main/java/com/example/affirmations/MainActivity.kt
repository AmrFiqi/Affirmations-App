package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset= Datasource().loadAffirmations()
        val recycleview=findViewById<RecyclerView>(R.id.recycle_view)
        recycleview.adapter=ItemAdapter(this,myDataset)
        recycleview.setHasFixedSize(true)

    }
}