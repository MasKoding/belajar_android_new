package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Doa
import org.w3c.dom.Text

class DoaAdapter(val data:ArrayList<Doa>) : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>(){
    class DoaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvJudulDoa: TextView = view.findViewById(R.id.tvJudulDoa)
        val tvArab:TextView = view.findViewById(R.id.tvDoaArab)
        val tvDoaLatin:TextView = view.findViewById(R.id.tvDoaLatin)
        val ivCollapse: ImageButton = view.findViewById(R.id.ivCollapse)
        val rlIsiDoa: RelativeLayout = view.findViewById(R.id.rlIsiDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_doa_harian,parent,false)
        return  DoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoa.text = item.judul
        holder.tvArab.text = item.arab
        holder.tvDoaLatin.text = item.latin
        holder.ivCollapse.setOnClickListener {
            println("Tes")
            if(holder.rlIsiDoa.visibility == View.GONE){
                holder.rlIsiDoa.visibility = View.VISIBLE
                holder.ivCollapse.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
            }else{
                holder.rlIsiDoa.visibility = View.GONE
                holder.ivCollapse.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_right_24)
            }
        }
    }

    override fun getItemCount(): Int = data.size


}