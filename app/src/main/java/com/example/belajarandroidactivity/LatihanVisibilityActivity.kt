package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvText:TextView = findViewById(R.id.tvText)
        val btnClick:Button = findViewById(R.id.btnClick)

//        event click
        btnClick.setOnClickListener {
//            munculkan text  set visibility menjadi visible
            if(tvText.visibility == View.VISIBLE){
                tvText.visibility =  View.INVISIBLE
            }else{
                tvText.visibility = View.VISIBLE
            }
        }


    }
}