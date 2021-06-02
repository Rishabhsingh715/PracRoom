package com.cv.pracroom

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.person.view.*

class PersonAdapter(val person: List<Person>,val db:Pdatabase) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

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
            db.getDao().delete(person[position].name)
          Log.d("DEL","Deleted the value")
        }

    }

    override fun getItemCount(): Int {

        return person.size
    }
}