package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class LatihanListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        //      define array adapter
        val language = arrayListOf<Language>(
            Language("Python",R.drawable.python),
            Language("C++",R.drawable.cplus),
            Language("Golang",R.drawable.golang)
        )

        val adapter = LanguageAdapter(language)
        val linearVertical = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        deklarasikan variabel listView
        var rvBahasaPemrograman: RecyclerView = findViewById(R.id.rvBahasaPemrograman)
//        panggil object ArrayAdapter(this,layout_sample,data)
        rvBahasaPemrograman.adapter = adapter
        rvBahasaPemrograman.layoutManager = linearVertical
    }
}
