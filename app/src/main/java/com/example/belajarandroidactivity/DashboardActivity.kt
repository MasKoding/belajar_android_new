package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class DashboardActivity : AppCompatActivity() {
    var produk1:RelativeLayout?=null
    var produk2:RelativeLayout?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        produk1 = findViewById(R.id.produk)
        produk1!!.setOnClickListener {
            val intent = Intent(this,BelajarRelativeActivity::class.java)
            startActivity(intent)
        }
    }
}