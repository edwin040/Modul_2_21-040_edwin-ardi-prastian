package com.example.pb2_soal2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val filmList:ArrayList<Film>)
    : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){

    var onItemClik : ((Film) -> Unit)?= null
    class FilmViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val textView : TextView = itemView.findViewById(R.id.textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item,parent,false ,)
        return FilmViewHolder(view)
    }
    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val Film =filmList[position]

        holder.textView.text = Film.name

        holder.itemView.setOnClickListener{
            onItemClik?.invoke(Film)
        }
    }

    override fun getItemCount(): Int {
        return filmList.size
    }


}