package com.example.belajarandroidactivity.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.ListDoaPilihanActivity
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.OpsiDoa

class OpsiDoaAdapter(val data:ArrayList<OpsiDoa>) : RecyclerView.Adapter<OpsiDoaAdapter.OpsiDoaViewHolder>() {
    class OpsiDoaViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val tvJudulOpsi:TextView = view.findViewById(R.id.tvJudulOpsiDoa)
        val ivGambarOpsi:ImageView = view.findViewById(R.id.ivGambarOpsi)
        val cvOpsi:CardView = view.findViewById(R.id.cvOpsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpsiDoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_opsi_doa,parent,false)
        return OpsiDoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: OpsiDoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.ivGambarOpsi.setImageResource(item.gambarOpsi)
        holder.tvJudulOpsi.text = item.judulOpsi
        holder.cvOpsi.setOnClickListener {
            val intent = Intent(holder.itemView.context,ListDoaPilihanActivity::class.java)
            intent.putExtra("judul",item.judulOpsi)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int  = data.size

}