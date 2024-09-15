package com.example.myapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.R
import com.example.myapp.model.Alumni

class AlumniAdapter(private val alumniList: List<Alumni>) :
    RecyclerView.Adapter<AlumniAdapter.AlumniViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumniViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.alumni_item, parent, false)
        return AlumniViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumniViewHolder, position: Int) {
        val alumni = alumniList[position]
        holder.nameTextView.text = alumni.name
        holder.detailsTextView.text = alumni.details
    }

    override fun getItemCount(): Int = alumniList.size

    inner class AlumniViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.alumni_name)
        val detailsTextView: TextView = itemView.findViewById(R.id.alumni_details)
    }
}