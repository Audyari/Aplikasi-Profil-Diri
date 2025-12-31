package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class PencarianActivity : AppCompatActivity() {
    
    private lateinit var etSearch: TextInputEditText
    private lateinit var btnSearch: Button
    private lateinit var tvEmptyState: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pencarian)
        
        // Initialize views
        etSearch = findViewById(R.id.etSearch)
        btnSearch = findViewById(R.id.btnSearch)
        tvEmptyState = findViewById(R.id.tvEmptyState)
        
        // Setup search button
        btnSearch.setOnClickListener {
            performSearch()
        }
        
        // Setup search action on keyboard
        etSearch.setOnEditorActionListener { _, _, _ ->
            performSearch()
            true
        }
    }
    
    private fun performSearch() {
        val query = etSearch.text.toString().trim()
        
        if (query.isEmpty()) {
            Toast.makeText(this, "Masukkan kata kunci pencarian", Toast.LENGTH_SHORT).show()
            return
        }
        
        // Simulasi pencarian
        Toast.makeText(this, "Mencari: $query", Toast.LENGTH_SHORT).show()
        
        // Log untuk debugging
        println("Search query: $query")
        
        // Di sini Anda bisa menambahkan logika pencarian aktual
        // Misalnya: mencari di database, API, atau data lokal
        
        // Untuk demo, kita akan menampilkan pesan
        if (query.contains("profil", ignoreCase = true) || query.contains("profile", ignoreCase = true)) {
            tvEmptyState.visibility = TextView.GONE
            Toast.makeText(this, "Ditemukan hasil untuk profil", Toast.LENGTH_SHORT).show()
        } else {
            tvEmptyState.visibility = TextView.VISIBLE
            tvEmptyState.text = "Tidak ada hasil ditemukan untuk '$query'"
        }
    }
}