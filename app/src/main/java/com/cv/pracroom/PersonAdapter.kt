package com.cv.pracroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.person.view.*

class PersonAdapter(val person: List<Person>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.person,parent,false
        )
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
       holder.itemView.tv1.text = person[position].name
        holder.itemView.tv2.text = person[position].skill

        holder.itemView.del.setOnClickListener {

        }

    }

    override fun getItemCount(): Int {

        return person.size
    }
}