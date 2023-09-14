package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class VisibilityActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visibility)
        val btnClick:Button = findViewById(R.id.btnClick)
        val tvJudul:TextView = findViewById(R.id.tvJudul)

        btnClick.setOnClickListener {
            // buat visibility gunakan Class View.Visible
            if(tvJudul.visibility == View.GONE)
               tvJudul.visibility = View.VISIBLE
            else
                tvJudul.visibility = View.GONE

        }
    }
}