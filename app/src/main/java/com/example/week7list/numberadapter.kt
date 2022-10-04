package com.example.week7list

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

data class numberadapter(private val data: List<Int>) : RecyclerView.Adapter<numberadapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): numberadapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.layout_row,parent, false) as View
        return ViewHolder(view)
    }
    override fun getItemCount() = data.size // this will display all number from 0-100 which are / by 5 or 3

    override fun onBindViewHolder(holder: numberadapter.ViewHolder, position: Int){
        val item = data[position]
        holder.bind(item)
    }

    class ViewHolder(private val v: View): RecyclerView.ViewHolder(v){ // This takes a view and stores it in a row
        private val number:TextView = v.findViewById(R.id.number)

        fun bind(item: Int){ // takes the data for each row and assigns it to the view in the rows as needed
            number.text = item.toString()
            v.setOnClickListener {
                val intent = Intent(it.context, DetailActivity::class.java)
                intent.putExtra("Extra", item)
                it.context.startActivity(intent)
            }
        }
    }
}
