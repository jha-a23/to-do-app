package pt.ipbeja.whattodo.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String,
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
)