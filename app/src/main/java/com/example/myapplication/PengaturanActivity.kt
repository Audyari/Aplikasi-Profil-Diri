package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial

class PengaturanActivity : AppCompatActivity() {
    
    private lateinit var switchNotifikasi: SwitchMaterial
    private lateinit var switchTema: SwitchMaterial
    private lateinit var btnTentang: Button
    private lateinit var btnKeluar: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan)
        
        // Initialize views
        switchNotifikasi = findViewById(R.id.switchNotifikasi)
        switchTema = findViewById(R.id.switchTema)
        btnTentang = findViewById(R.id.btnTentang)
        btnKeluar = findViewById(R.id.btnKeluar)
        
        // Setup switch listeners
        switchNotifikasi.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Aktif" else "Nonaktif"
            Toast.makeText(this, "Notifikasi $status", Toast.LENGTH_SHORT).show()
            println("Notifikasi: $status")
        }
        
        switchTema.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Gelap" else "Terang"
            Toast.makeText(this, "Tema $status", Toast.LENGTH_SHORT).show()
            println("Tema: $status")
            // Di sini Anda bisa implementasi perubahan tema aplikasi
        }
        
        // Setup button listeners
        btnTentang.setOnClickListener {
            showAboutDialog()
        }
        
        btnKeluar.setOnClickListener {
            logout()
        }
    }
    
    private fun showAboutDialog() {
        // Menampilkan dialog tentang aplikasi
        val message = """
            Aplikasi Profil Diri
            Versi: 1.0.0
            Developer: Your Name
            
            Aplikasi ini dirancang untuk mengelola profil diri dengan fitur:
            - Manajemen profil pribadi
            - Pencarian data
            - Pengaturan aplikasi
        """.trimIndent()
        
        androidx.appcompat.app.AlertDialog.Builder(this)
            .setTitle("Tentang Aplikasi")
            .setMessage(message)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
    
    private fun logout() {
        androidx.appcompat.app.AlertDialog.Builder(this)
            .setTitle("Konfirmasi Keluar")
            .setMessage("Apakah Anda yakin ingin keluar?")
            .setPositiveButton("Ya") { dialog, _ ->
                Toast.makeText(this, "Terima kasih telah menggunakan aplikasi!", Toast.LENGTH_SHORT).show()
                // Kembali ke halaman utama atau tutup aplikasi
                finish()
            }
            .setNegativeButton("Tidak") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}