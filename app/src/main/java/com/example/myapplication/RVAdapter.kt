package com.example.myapplication

import android.widget.TextView
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.text.FieldPosition


class RVAdapter(private var listPrice: List<String>, private var listTime: List<String>, private var listBonus: List<String>) :
    RecyclerView.Adapter<RVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.sale, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemPrice.text = listPrice[position]
        holder.itemTime.text = listTime[position]
        holder.itemBonus.text = listBonus[position]
    }

    class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var cv: CardView
        internal var itemPrice: TextView
        internal var itemTime: TextView
        internal var itemBonus: TextView

        init {
            cv = itemView.findViewById(R.id.cv)
            itemPrice = itemView.findViewById(R.id.price)
            itemTime = itemView.findViewById(R.id.time)
            itemBonus = itemView.findViewById(R.id.bonus)
        }
    }

}