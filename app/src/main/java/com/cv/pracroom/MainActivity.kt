package com.cv.pracroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val db by lazy {
        Room.databaseBuilder(this,
        Pdatabase::class.java,"PDatabase").allowMainThreadQueries()
            .fallbackToDestructiveMigration().build()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val name = ed1.text.toString()
            val skill = ed2.text.toString()

            db.getDao().insert(Person(name,skill))
            Toast.makeText(this,"Refresh now",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {

           val ll : List<Person> =  db.getDao().getAll()
           val Padapter = PersonAdapter(ll,db)

            RV.layoutManager = LinearLayoutManager(this)
            RV.adapter = Padapter

        }


    }
}