package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Language

class LanguageAdapter(val data:ArrayList<Language>) : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>(){
    class LanguageViewHolder(view: View) :RecyclerView.ViewHolder(view){
//        deklarasi view yang kita mau gunakan pada card item bahasa pemrograman
        val ivLogo:ImageView = view.findViewById(R.id.ivLogo)
        val tvBahasa:TextView = view.findViewById(R.id.tvBahasa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
//        Terapkan layout item_bahasa_pemrograman pada recycler view kita ke masing masing item nya
        val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_bahasa_pemrograman,parent,false)
        return  LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
//        ambil single data pada array language dengan mengambil berdasarkan position nya
        val item = data.get(position)
//        isi data pada masing masing view yang sudah kita buat
        holder.ivLogo.setImageResource(item.image)
        holder.tvBahasa.text = item.name

    }

    override fun getItemCount(): Int = data.size


}