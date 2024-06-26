package com.example.fibonacciproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.math.BigInteger

class SequenceNumbers (var nums:List<BigInteger>):RecyclerView.Adapter<AllFibonacciHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllFibonacciHolder {
        val itemView = LayoutInflater.from (parent.context).inflate(R.layout.sequence,parent,false)
        return AllFibonacciHolder(itemView)

    }

    override fun onBindViewHolder(holder: AllFibonacciHolder, position: Int) {
        holder.rvNumbers.text= nums[position].toString()
    }


    override fun getItemCount(): Int {
        return nums.size
    }

}
class AllFibonacciHolder(itemView:View):ViewHolder(itemView){
    var rvNumbers= itemView.findViewById<TextView>(R.id.rvNumbers)

}