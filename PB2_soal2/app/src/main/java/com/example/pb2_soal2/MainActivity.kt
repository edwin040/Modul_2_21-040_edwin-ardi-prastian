package com.example.pb2_soal2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var filmList: ArrayList<Film>
    private lateinit var filmAdapter: FilmAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        filmList = ArrayList()

        filmList.add(Film(R.drawable.film,"Menu 1","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 2","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 3","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 4","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 5","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 6","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 7","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 8","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 9","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 10","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 11","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 12","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 13","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 14","ini description"))
        filmList.add(Film(R.drawable.film,"Menu 15","ini description"))

        filmAdapter = FilmAdapter(filmList)
        recyclerView.adapter = filmAdapter

        }
}