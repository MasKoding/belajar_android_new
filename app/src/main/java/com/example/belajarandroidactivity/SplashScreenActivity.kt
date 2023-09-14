package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val tvJudul:TextView = findViewById(R.id.tvJudul)
//        panggil object Handler dari package OS
//        postDelayed untuk menjalankan action ketika
//        waktu yang ditentukan telah selesai 1000ms=1s

        Handler().postDelayed({

            val intent = Intent(this,
                DashboardDoaActivity::class.java)
            startActivity(intent)
        },6000)


    }
}