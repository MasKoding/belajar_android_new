package com.example.belajarandroidactivity.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.DetailDoaActivity
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.OpsiDoa
import com.example.belajarandroidactivity.model.PilihDoa

class PilihanDoaAdapter(val data:ArrayList<PilihDoa>) : RecyclerView.Adapter<PilihanDoaAdapter.PilihanDoaViewHolder>() {
    class PilihanDoaViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val tvJudulPilihan:TextView = view.findViewById(R.id.tvJudulPilihan)
        val ivGambarDoaPilihan:ImageView = view.findViewById(R.id.ivGambarDoaPilihan)
        val cvPilihan:CardView = view.findViewById(R.id.cvPilihan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PilihanDoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa_pilihan,parent,false)
        return PilihanDoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PilihanDoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.ivGambarDoaPilihan.setImageResource(item.gambarPilihan)
        holder.tvJudulPilihan.text = item.judulPilihan
        holder.cvPilihan.setOnClickListener {

            val intent = Intent(holder.itemView.context,DetailDoaActivity::class.java)
            intent.putExtra("id",item.id)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int  = data.size

}