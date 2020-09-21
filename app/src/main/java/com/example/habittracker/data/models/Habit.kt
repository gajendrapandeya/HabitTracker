package com.example.habittracker.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Habit (
    @PrimaryKey
    val id: Int,
    val habit_title: String,
    val habit_description: String,
    val habit_startTime: String,
    val imageId: Int
) : Parcelable