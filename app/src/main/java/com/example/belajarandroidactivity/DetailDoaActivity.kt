package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class DetailDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_doa)
        val ibBackBtn: ImageButton = findViewById(R.id.ibBackBtn2)
        val tvJudulDetailDoa: TextView = findViewById(R.id.tvJudulDetail)
        val tvDetailArab: TextView = findViewById(R.id.tvDetailArab)
        val tvDetailLatin: TextView = findViewById(R.id.tvDetailLatin)

        ibBackBtn.setOnClickListener {
            val intent = Intent(this,ListDoaPilihanActivity::class.java)

            startActivity(intent)
        }

        val id = intent.extras?.get("id")
        if(id == 1){
            tvJudulDetailDoa.text="Doa Bangun Tidur"
            tvDetailArab.text = "الْحَمْدُ لِلّٰهِ الّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْر"
            tvDetailLatin.text = "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"
        }else{
            tvJudulDetailDoa.text="Doa Bangun Tidur"
            tvDetailArab.text = "الْحَمْدُ لِلّٰهِ الّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْر"
            tvDetailLatin.text = "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"
        }


    }
}