package com.cv.pracroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDao {

    @Insert
    fun insert(person: Person)

    @Query("select * from Person")
    fun getAll(): List<Person>

}