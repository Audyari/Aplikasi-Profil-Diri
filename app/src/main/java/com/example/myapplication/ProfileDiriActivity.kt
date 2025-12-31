package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.model.ProfileData
import com.google.android.material.textfield.TextInputEditText

class ProfileDiriActivity : AppCompatActivity() {
    
    private lateinit var etName: TextInputEditText
    private lateinit var etEmail: TextInputEditText
    private lateinit var etPhone: TextInputEditText
    private lateinit var etBio: TextInputEditText
    private lateinit var etLocation: TextInputEditText
    private lateinit var etBirthDate: TextInputEditText
    private lateinit var btnSave: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_diri)
        
        // Initialize views
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)
        etBio = findViewById(R.id.etBio)
        etLocation = findViewById(R.id.etLocation)
        etBirthDate = findViewById(R.id.etBirthDate)
        btnSave = findViewById(R.id.btnSave)
        
        // Load dummy profile data
        loadProfileData()
        
        // Setup save button
        btnSave.setOnClickListener {
            saveProfile()
        }
    }
    
    private fun loadProfileData() {
        // Dummy data - bisa diganti dengan data dari database atau API
        val profile = ProfileData(
            name = "John Doe",
            email = "john.doe@example.com",
            phone = "+62 812 3456 7890",
            bio = "Mobile Developer dengan passion dalam menciptakan aplikasi yang user-friendly dan inovatif.",
            location = "Jakarta, Indonesia",
            birthDate = "01 Januari 1990"
        )
        
        etName.setText(profile.name)
        etEmail.setText(profile.email)
        etPhone.setText(profile.phone)
        etBio.setText(profile.bio)
        etLocation.setText(profile.location)
        etBirthDate.setText(profile.birthDate)
    }
    
    private fun saveProfile() {
        val name = etName.text.toString()
        val email = etEmail.text.toString()
        val phone = etPhone.text.toString()
        val bio = etBio.text.toString()
        val location = etLocation.text.toString()
        val birthDate = etBirthDate.text.toString()
        
        if (name.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Nama dan Email harus diisi", Toast.LENGTH_SHORT).show()
            return
        }
        
        val profile = ProfileData(
            name = name,
            email = email,
            phone = phone,
            bio = bio,
            location = location,
            birthDate = birthDate
        )
        
        // Simpan data (bisa ke database lokal atau shared preferences)
        Toast.makeText(this, "Profil berhasil disimpan!", Toast.LENGTH_SHORT).show()
        
        // Log data untuk debugging
        println("Profile saved: $profile")
    }
}