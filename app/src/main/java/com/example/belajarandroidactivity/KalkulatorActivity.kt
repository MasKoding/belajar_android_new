package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkulatorActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        val edAngka1:EditText = findViewById(R.id.edAngka1)
        val edAngka2:EditText = findViewById(R.id.edAngka2)
        val btnPlus:Button = findViewById(R.id.btnPlus)
        val btnMinus:Button = findViewById(R.id.btnMinus)
        val btnKali:Button = findViewById(R.id.btnKali)
        val btnModulus:Button = findViewById(R.id.btnModulus)
        val btnBagi:Button = findViewById(R.id.btnBagi)
        val btnClear:Button = findViewById(R.id.btnClear)
        val tvHasil:TextView = findViewById(R.id.tvHasil)

     // import dari androidx
        val builder: AlertDialog.Builder =
            AlertDialog.Builder(this@KalkulatorActivity)

        btnPlus.setOnClickListener {
            val hasilTambah = edAngka1.text.toString().toInt()+ edAngka2.text.toString().toInt()
            tvHasil.text = hasilTambah.toString()
        }
        btnMinus.setOnClickListener {
            val hasilKurang = edAngka1.text.toString().toInt()- edAngka2.text.toString().toInt()
            tvHasil.text = hasilKurang.toString()
        }
        btnModulus.setOnClickListener {
            val hasilModulus = edAngka1.text.toString().toInt() % edAngka2.text.toString().toInt()
            tvHasil.text = hasilModulus.toString()
        }
        btnKali.setOnClickListener {
            val hasilKali = edAngka1.text.toString().toInt() * edAngka2.text.toString().toInt()
            tvHasil.text = hasilKali.toString()
        }
        btnBagi.setOnClickListener {
            val hasilBagi:Double = (edAngka1.text.toString().toDouble()/ edAngka2.text.toString().toDouble()).toDouble()
            tvHasil.text = hasilBagi.toString()
        }
        btnClear.setOnClickListener {
//        buat popup / alert dengan tentukan title,message dan cancel
          builder.setTitle("Perhatian!")
          builder.setMessage("Kamu yakin ingin menghapus semua data?")
          builder.setCancelable(false)
//            buat tombol Yes
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                edAngka1.setText("")
                edAngka2.setText("")
                tvHasil.text = "0"
            })
//            buat tombol No
            builder.setNegativeButton("No",
                DialogInterface.OnClickListener { dialog, which ->  })
            builder.setIcon(R.drawable.ic_baseline_info_24)
//          agar builder kita dibuat harus panggil fungsi builder.create()
            val alertDialog:AlertDialog = builder.create()
//            tampilkan alert kita
             alertDialog.show()
        }




    }
}