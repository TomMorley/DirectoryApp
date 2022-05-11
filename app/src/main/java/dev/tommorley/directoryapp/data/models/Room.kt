package dev.tommorley.directoryapp.data.models

data class Room(
    val createdAt : String,
    val isOccupied : Boolean,
    val maxOccupancy : Int,
    val id : Int
)
