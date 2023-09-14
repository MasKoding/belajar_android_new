package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.belajarandroidactivity.adapter.PilihanDoaAdapter
import com.example.belajarandroidactivity.model.PilihDoa

class ListDoaPilihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_doa_pilihan)
        val tvJudulListDoa:TextView = findViewById(R.id.tvJudulListDoa)
        val rvPilihanDoa:RecyclerView = findViewById(R.id.rvPilihanDoa)
        val ivBackBtn:ImageButton = findViewById(R.id.ivBackBtn)
        val  pilihanDoa = arrayListOf<PilihDoa>(
            PilihDoa(1,"Makan",R.drawable.doa_makan),
            PilihDoa(2,"Berpakaian",R.drawable.doa_makan),
            PilihDoa(3,"Tidur",R.drawable.doa_makan),
            PilihDoa(4,"Tidur",R.drawable.doa_makan),
            PilihDoa(5,"Tidur",R.drawable.doa_makan),
            PilihDoa(6,"Tidur",R.drawable.doa_makan),
            PilihDoa(7,"Tidur",R.drawable.doa_makan),

        )

        val title =   intent.extras?.get("judul")
        tvJudulListDoa.text = title.toString()
        val adapter = PilihanDoaAdapter(pilihanDoa)
        rvPilihanDoa.adapter = adapter
        rvPilihanDoa.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        ivBackBtn.setOnClickListener {
            val intent = Intent(this,DashboardDoaActivity::class.java)
            startActivity(intent)
        }
    }
}