package com.cv.pracroom

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Person::class],version = 1)
abstract class Pdatabase: RoomDatabase() {

    abstract fun getDao() : PersonDao
}