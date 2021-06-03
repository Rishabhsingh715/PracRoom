package com.cv.pracroom

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.person.view.*

class PersonAdapter(val person: List<Person>,val listener: delete) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {

        val view = PersonViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.person,parent,false
        ))
        view.itemView.del.setOnClickListener{
            listener.onItemClicked(person[view.adapterPosition])
        }

        return view
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
       holder.itemView.tv1.text = person[position].name
        holder.itemView.tv2.text = person[position].skill



    }

    override fun getItemCount(): Int {

        return person.size
    }
}

interface delete {
    fun onItemClicked(person : Person)
}