package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val builder:AlertDialog.Builder = AlertDialog.Builder(this@CountActivity)
//        deklarasi variabel dari masing masing object/view
        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnReset : Button = findViewById(R.id.btnReset)
        val btnMinus : Button = findViewById(R.id.btnMinus)

//        panggil fungsi
//         setText dan getText
//        setText = merubah/mengisi text  cukup panggil fungsi text
        tvNumber.text = "100"
//        getText  = mengambil text
        println(tvNumber.text)
        Log.d("Number", "Hasilnya: ${tvNumber.text} ")

//        action
        btnCount.setOnClickListener {
//            bikin variabel nilainya berubah
//            ambil text lalu konversi dari String ke Integer
            var countInteger :Int = tvNumber.text.toString().toInt()
            countInteger++

//            setText
            tvNumber.text = countInteger.toString()
        }
// action untuk minus
        btnMinus.setOnClickListener {
//            bikin variabel nilainya berubah
//            ambil text lalu konversi dari String ke Integer
            var countInteger :Int = tvNumber.text.toString().toInt()
            countInteger--

//            setText
            tvNumber.text = countInteger.toString()
        }


        btnReset.setOnClickListener {
//            setText
            tvNumber.text = "0"

        }

    }
}