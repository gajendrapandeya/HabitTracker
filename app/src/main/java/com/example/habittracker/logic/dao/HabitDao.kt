package com.example.habittracker.logic.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.habittracker.data.models.Habit

@Dao
interface HabitDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addHabit(habit: Habit)

    @Update
    suspend fun updateHabit(habit: Habit)

    @Delete
    suspend fun deleteHabit(habit: Habit)

    @Query(" SELECT * FROM habit ORDER BY id DESC")
    fun getAll(): LiveData<List<Habit>>

    @Query("DELETE FROM habit")
    suspend fun deleteAll()
}