package com.cv.pracroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Person(

@PrimaryKey
val name: String,

@ColumnInfo
val skill: String

)
