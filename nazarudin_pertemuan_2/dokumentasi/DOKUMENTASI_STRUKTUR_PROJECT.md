# Dokumentasi Project Latihan 2

Project ini dibuat sebagai contoh `JFrame Form` sederhana menggunakan Java 8 dan NetBeans 8.2.

## Identitas project

- Nama project: `latihan2`
- Package utama: `nazarudin_pertemuan2`
- Class JFrame Form: `nazarudin_Latihan2`
- Fully-qualified class: `nazarudin_pertemuan2.nazarudin_Latihan2`
- Judul window: `Latihan 2 - JFrame Form`

Nama `nazarudin` digunakan mengikuti nama folder tugas. Jika nama mahasiswa berbeda, ganti nama package, class, dan `main.class` secara konsisten.

## Struktur folder

```text
latihan2/
├── build.xml                         # Perintah build Ant NetBeans
├── manifest.mf                       # Main-Class untuk file JAR
├── nbproject/
│   ├── build-impl.xml                # Target Ant project
│   ├── project.properties            # Konfigurasi Java 8 dan source folder
│   └── project.xml                   # Metadata project Java NetBeans
├── src/
│   └── nazarudin_pertemuan2/
│       ├── nazarudin_Latihan2.java   # Source JFrame Form dan event tombol
│       └── nazarudin_Latihan2.form   # Metadata desain GUI Builder NetBeans
└── DOKUMENTASI_STRUKTUR_PROJECT.md  # Penjelasan project
```

## Penjelasan bagian penting

1. `src` adalah tempat source code Java.
2. Folder `nazarudin_pertemuan2` adalah package sesuai pola nama mahasiswa dan pertemuan.
3. File `.java` berisi class `nazarudin_Latihan2`, komponen Swing, layout `GroupLayout`, dan event handler.
4. File `.form` adalah file yang dibaca GUI Builder NetBeans. File ini berpasangan dengan file `.java` dan membuat class dapat dibuka sebagai `JFrame Form`.
5. `nbproject` menyimpan konfigurasi project NetBeans berbasis Ant. Nilai `javac.source` dan `javac.target` diatur ke `1.8`.
6. `build.xml` adalah entry point perintah `Clean and Build`.

## Komponen dan output

Form menampilkan:

- label judul `JFrame Form Latihan 2`;
- label petunjuk;
- `JTextField` untuk memasukkan nama;
- tombol `Tampilkan`;
- tombol `Bersihkan`;
- label output.

Jika nama diisi lalu tombol `Tampilkan` ditekan, contoh outputnya adalah:

```text
Halo, Nazarudin! Selamat belajar JFrame Form.
```

Jika input kosong, form menampilkan pesan informasi. Tombol `Bersihkan` mengosongkan input dan mengembalikan teks output awal.

## Cara membuka di NetBeans 8.2

1. Buka NetBeans 8.2.
2. Pilih `File > Open Project`.
3. Pilih folder project ini, yaitu folder yang berisi `nbproject` dan `build.xml`.
4. Pastikan Java Platform yang dipilih adalah JDK 8.
5. Klik kanan project, pilih `Clean and Build`, kemudian `Run`.

