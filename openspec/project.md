# Konteks Proyek

## Tujuan
Ini adalah aplikasi Android asli untuk **Manajemen Profil Diri** yang dibangun dengan Kotlin dan praktik pengembangan Android modern. Aplikasi ini menyediakan fitur lengkap untuk mengelola profil pribadi, pencarian data, dan pengaturan aplikasi dengan antarmuka yang user-friendly.

## Tech Stack

### Teknologi Utama
- **Bahasa**: Kotlin (2.0.21)
- **Sistem Build**: Gradle dengan Kotlin DSL
- **Android SDK**: Compile SDK 36, Min SDK 29, Target SDK 36
- **Framework UI**: AndroidX dengan komponen Material Design

### Dependensi Utama
- **androidx-core-ktx**: 1.10.1 - Ekstensi Kotlin untuk Android
- **androidx-appcompat**: 1.6.1 - Library kompatibilitas aplikasi
- **androidx-activity**: 1.8.0 - Activity dan dukungan edge-to-edge
- **androidx-constraintlayout**: 2.1.4 - Manajemen layout lanjutan
- **Material Design**: 1.10.0 - Komponen Material untuk Android
- **Testing**: JUnit 4.13.2, Espresso 3.5.1, AndroidX Test 1.1.5

### Konfigurasi Build
- **Android Gradle Plugin**: 8.13.2
- **Kompatibilitas Java**: Java 11
- **Tipe Build**: Debug (tidak di-minify), Release (dengan aturan ProGuard)

## Konvensi Proyek

### Gaya Kode
- **Bahasa**: Kotlin dengan konvensi penamaan Android
- **Struktur Package**: Struktur Android standar (`com.example.myapplication`)
- **Penamaan Activity**: Akhiri activity dengan `Activity` (contoh: `MainActivity`, `ProfileDiriActivity`)
- **File Layout**: Snake case dengan prefix activity (contoh: `activity_main.xml`, `activity_profile_diri.xml`)
- **Penamaan Resource**: Snake case untuk semua resource

### Pola Arsitektur
- **Pola**: Arsitektur berbasis Activity tradisional
- **Framework UI**: Layout XML dengan View binding
- **Edge-to-Edge**: Implementasi edge-to-edge modern menggunakan `enableEdgeToEdge()`
- **Inset Jendela**: Penanganan sistem bar yang tepat menggunakan `WindowInsetsCompat`

### Struktur Proyek
```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/myapplication/
│   │   │   ├── MainActivity.kt              # Halaman splash/awal
│   │   │   ├── MainMenuActivity.kt          # Menu utama dengan 4 pilihan
│   │   │   ├── ProfileDiriActivity.kt       # Manajemen profil diri
│   │   │   ├── PencarianActivity.kt         # Fitur pencarian
│   │   │   ├── PengaturanActivity.kt        # Pengaturan aplikasi
│   │   │   └── model/
│   │   │       └── ProfileData.kt           # Model data profil
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_main.xml        # Layout splash
│   │   │   │   ├── activity_main_menu.xml   # Layout menu utama
│   │   │   │   ├── activity_profile_diri.xml # Layout profil
│   │   │   │   ├── activity_pencarian.xml   # Layout pencarian
│   │   │   │   └── activity_pengaturan.xml  # Layout pengaturan
│   │   │   ├── values/                      # String, color, theme
│   │   │   ├── drawable/                    # Drawable
│   │   │   └── mipmap-*/                    # Icon launcher
│   │   └── AndroidManifest.xml
│   ├── test/                    # Unit test
│   └── androidTest/             # Instrumentation test
├── build.gradle.kts
└── proguard-rules.pro
```

### Strategi Testing
- **Unit Test**: JUnit 4 di `app/src/test/`
- **Instrumentation Test**: AndroidX Test dengan Espresso di `app/src/androidTest/`
- **Test Runner**: AndroidJUnitRunner
- **Coverage**: Kemampuan testing unit dan UI dasar

### Alur Git
- **Git flow standar** dengan branch fitur
- **Conventional commits** direkomendasikan
- **ProGuard**: Build release menggunakan aturan optimasi

## Fitur Aplikasi

### Menu Utama (4 Opsi)
1. **Profile Diri**: Manajemen data pribadi lengkap
2. **Menu Utama**: Halaman utama dengan navigasi
3. **Pencarian**: Fitur pencarian data profil
4. **Pengaturan**: Konfigurasi aplikasi

### Profile Diri
- Input data: Nama, Email, Telepon, Bio, Lokasi, Tanggal Lahir
- Validasi input (Nama dan Email wajib diisi)
- Simpan data dengan feedback user
- Tampilan form yang user-friendly

### Pencarian
- Input kata kunci pencarian
- Validasi input
- Hasil pencarian dengan feedback
- Empty state handling

### Pengaturan
- Toggle notifikasi
- Toggle tema (gelap/terang)
- Informasi versi aplikasi
- Dialog "Tentang Aplikasi"
- Konfirmasi logout

## Konteks Domain

### Praktik Pengembangan Android Terbaik
- **Target API Level**: 36 (Android 14+)
- **Minimum API Level**: 29 (Android 10) - mencakup 95%+ perangkat aktif
- **API Modern**: Menggunakan library AndroidX terbaru
- **Kompatibilitas Mundur**: Mempertahankan kompatibilitas dengan perangkat lama sambil menggunakan fitur modern

### Standar UI/UX
- **Material Design**: Mengikuti pedoman Material Design 3
- **Edge-to-Edge**: Pengalaman layar penuh dengan penanganan sistem bar yang tepat
- **Aksesibilitas**: Dukungan bawaan untuk inset jendela dan UI sistem
- **Desain Responsif**: ConstraintLayout untuk layout adaptif
- **User Feedback**: Toast messages dan dialog untuk interaksi user

### Keamanan & Privasi
- **Aturan Backup**: Aturan ekstraksi data dan backup terkonfigurasi
- **Keamanan Aplikasi**: Praktik keamanan Android standar
- **Izin**: Menggunakan model izin Android standar
- **Validasi Input**: Perlindungan dari input kosong atau tidak valid

## Kendala Penting

### Kendala Teknis
- **Versi Java**: Harus menggunakan Java 11 untuk kompilasi
- **Versi Kotlin**: Dikunci ke 2.0.21 untuk stabilitas
- **Gradle**: Menggunakan Kotlin DSL untuk konfigurasi build
- **ProGuard**: Hanya diterapkan pada build release

### Kendala Platform
- **Android Saja**: Aplikasi Android asli platform tunggal
- **Tidak Cross-Platform**: Tidak menggunakan Flutter, React Native, atau framework lain
- **Performa Native**: Dioptimalkan untuk performa Android asli

### Kendala Pengembangan
- **IDE**: Memerlukan Android Studio atau IDE yang kompatibel
- **Build Tools**: Android Gradle Plugin 8.13.2
- **Testing**: Harus mempertahankan testing unit dan instrumentation
- **Data Storage**: Menggunakan shared preferences atau database lokal untuk persistensi data

## Dependensi Eksternal

### Layanan Google
- **Google Maven Repository**: Sumber utama untuk dependensi Android
- **Maven Central**: Repositori sekunder untuk library pihak ketiga
- **Gradle Plugin Portal**: Untuk plugin Gradle

### Tools Pengembangan
- **Android SDK**: Platform SDK dan build tools
- **Gradle Wrapper**: Sistem build terkontrol versi
- **Android Gradle Plugin**: Integrasi sistem build

### Infrastruktur Testing
- **AndroidX Test**: Framework testing resmi Google
- **Espresso**: Framework testing UI
- **JUnit**: Framework testing unit

## Metadata Proyek

### Detail Aplikasi
- **Nama Aplikasi**: Aplikasi Profil Diri
- **Package**: com.example.myapplication
- **Versi**: 1.0 (Code: 1)
- **Launcher**: MainActivity dengan MAIN/LAUNCHER intent filter

### Struktur Navigasi
1. **MainActivity** → Splash/Welcome screen
2. **MainMenuActivity** → Pusat navigasi dengan 4 menu
3. **ProfileDiriActivity** → Manajemen profil pribadi
4. **PencarianActivity** → Fitur pencarian data
5. **PengaturanActivity** → Konfigurasi aplikasi

### Variants Build
- **Debug**: Build pengembangan dengan debugging lengkap
- **Release**: Build produksi dengan optimasi ProGuard

### Konfigurasi Release
- **Minify**: Dinonaktifkan untuk debug, diaktifkan untuk release
- **Aturan ProGuard**: Aturan kustom di `proguard-rules.pro`
- **Aturan Fallback**: Aturan ProGuard Android default disertakan

### Data Model
```kotlin
data class ProfileData(
    val name: String,
    val email: String,
    val phone: String,
    val bio: String,
    val location: String,
    val birthDate: String,
    val profileImageRes: Int? = null
)
```

## Catatan Pengembangan

### Roadmap Potensial
- [ ] Implementasi database lokal (Room/SQLite)
- [ ] Upload foto profil dari galeri
- [ ] Export data profil ke PDF/CSV
- [ ] Dark mode toggle yang berfungsi penuh
- [ ] Multi-language support
- [ ] Backup & restore data
- [ ] Share profil via social media

### Best Practices
- Gunakan ViewModel untuk state management
- Implementasi Repository pattern untuk data layer
- Tambahkan error handling yang robust
- Gunakan coroutines untuk operasi async
- Implementasi dependency injection (Hilt/Dagger)
- Tambahkan analytics dan crash reporting

### Performance Optimization
- Gunakan View Binding untuk menghindari findViewById
- Optimalkan layout dengan ConstraintLayout
- Implementasi lazy loading untuk data besar
- Gunakan ProGuard/R8 untuk minifikasi
- Optimalkan gambar dengan WebP format
