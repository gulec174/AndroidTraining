package com.example.myapplication


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var listPrice = mutableListOf<String>()
    private var listTime = mutableListOf<String>()
    private var listBonus = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        setContentView(R.layout.activity_main)
        postToList()

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = RVAdapter(listPrice, listTime, listBonus)
    }

    private fun addToList(price: String, time: String, bonus: String) {
        listPrice.add(price)
        listTime.add(time)
        listBonus.add(bonus)
    }

    private fun postToList() {
        addToList("Покупка на 100 рублей", "29 сентября 2020", "+11")
        addToList("Покупка на 200 рублей", "30 сентября 2020", "+22")
        addToList("Покупка на 300 рублей", "29 сентября 2020", "+33")
    }
}
