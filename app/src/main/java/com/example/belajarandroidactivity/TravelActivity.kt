package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
//     ? artinya boleh kosong = null
//    deklarasikan variabel
    var ibCall: ImageButton? = null
    var ibNavigate: ImageButton?=null
    var ibShare: ImageButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
//      isi pakai findViewById(ambilID)
        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)
//        event onClick
        ibCall!!.setOnClickListener {
//            parameter Intent untuk telpon Intent.ACTION_DIAL
            val phoneNumber="025123122"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
//            jalankan intent
            startActivity(phoneIntent)
        }

        ibNavigate!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:46.54671094451065, 7.893034139534986")
                )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)

        }
    }
}