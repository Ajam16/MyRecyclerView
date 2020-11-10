package com.example.myrecyclerview

@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: String
)

annotation class Parcelize
