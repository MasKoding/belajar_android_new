package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian :RecyclerView= findViewById(R.id.rvDoa)
        val kumpulanDoa = arrayListOf<Doa>(
            Doa("Doa Bangun Dari Tidur","الْحَمْدُ لِلّٰهِ الّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْرِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),

        )
        val adapter = DoaAdapter(kumpulanDoa)
        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}