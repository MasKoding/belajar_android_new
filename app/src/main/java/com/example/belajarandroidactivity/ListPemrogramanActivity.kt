package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasaPemrograman: RecyclerView = findViewById(R.id.rvBahasaPemrograman)
        val languages = arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("C ++",R.drawable.cplus),
            Language("Python",R.drawable.python)
        )
        val adapter = LanguageAdapter(languages)
        val linearVertical = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        rvBahasaPemrograman.adapter = adapter
        rvBahasaPemrograman.layoutManager = linearVertical

    }
}