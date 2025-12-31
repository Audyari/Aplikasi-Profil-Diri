package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainMenuActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        
        // Setup click listeners untuk setiap menu
        val cardProfile = findViewById<androidx.cardview.widget.CardView>(R.id.cardProfile)
        val cardMainMenu = findViewById<androidx.cardview.widget.CardView>(R.id.cardMainMenu)
        val cardSearch = findViewById<androidx.cardview.widget.CardView>(R.id.cardSearch)
        val cardSettings = findViewById<androidx.cardview.widget.CardView>(R.id.cardSettings)
        
        cardProfile.setOnClickListener {
            val intent = Intent(this, ProfileDiriActivity::class.java)
            startActivity(intent)
        }
        
        cardMainMenu.setOnClickListener {
            Toast.makeText(
                this, 
                "Menu Utama - Halaman ini sudah aktif", 
                Toast.LENGTH_SHORT
            ).show()
        }
        
        cardSearch.setOnClickListener {
            val intent = Intent(this, PencarianActivity::class.java)
            startActivity(intent)
        }
        
        cardSettings.setOnClickListener {
            val intent = Intent(this, PengaturanActivity::class.java)
            startActivity(intent)
        }
    }
}