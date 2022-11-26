package com.dicoding.todoapp.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//TODO 1 : Define a local database table using the schema in app/schema/tasks.json
@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @NonNull
    @ColumnInfo(name = "title")
    val title: String,

    @NonNull
    @ColumnInfo(name = "description")
    val description: String,

    @NonNull
    @ColumnInfo(name = "dueDate")
    val dueDateMillis: Long,

    @NonNull
    @ColumnInfo(name = "completed")
    val isCompleted: Boolean = false
)