package com.example.myapplication.model

data class ProfileData(
    val name: String,
    val email: String,
    val phone: String,
    val bio: String,
    val location: String,
    val birthDate: String,
    val profileImageRes: Int? = null
)

data class MenuItem(
    val title: String,
    val description: String,
    val iconRes: Int,
    val targetActivity: Class<*>
)