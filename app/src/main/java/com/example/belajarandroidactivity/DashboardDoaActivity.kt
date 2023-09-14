package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.OpsiDoaAdapter
import com.example.belajarandroidactivity.model.OpsiDoa

class DashboardDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvOpsiDoa: RecyclerView = findViewById(R.id.rvOpsiDoa)
        val opsiDoaList = arrayListOf<OpsiDoa>(
            OpsiDoa("Dzikir & Doa Sunnah Setelah Shalat",R.drawable.doa_harian2),
            OpsiDoa("Dzikir Harian",R.drawable.doa_harian2),
            OpsiDoa("Dzikir & Doa Sunnah Setelah Shalat",R.drawable.doa_harian2),
            OpsiDoa("Dzikir Setiap Saat",R.drawable.doa_harian2),
            OpsiDoa("Dzikir Pagi dan Petang",R.drawable.doa_harian2),

        )
        val cvSelengkapnya:CardView = findViewById(R.id.cvSelengkapnya)

        val adapter = OpsiDoaAdapter(opsiDoaList)
        rvOpsiDoa.adapter = adapter
        rvOpsiDoa.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        cvSelengkapnya.setOnClickListener {
            val intent = Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }

    }
}