package com.example.expansionnotes.domein.model

data class Note(
    val id: Int,
    val name: String,
    val city: String,
    val address: String,
    val type: String,
    val date: String,
    val pedestrianFlow: Int,
    val description: String,
    val autoFlowFirst: Int,
    val entranceFirst: Boolean,
    val autoFlowSecond: Int,
    val entranceSecond: Boolean,
    val parkingSize: Int,
    val parkingAddSize: Int
)
