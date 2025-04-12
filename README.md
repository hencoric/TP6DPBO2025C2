# Janji

Saya Marco Henrik Abineno dengan NIM 2301093 berjanji mengerjakan TP6 DPBO dengan keberkahan-Nya, maka saya tidak akan melakukan kecurangan sesuai yang telah di spesifikasikan, Aamiin

# Desain Program

Komponen Utama Program:

## Menu Utama (App class)

- **Tampilan**: Menampilkan menu utama dengan tombol "Mulai Game".  

- **Fungsi Tombol**: Ketika tombol "Mulai Game" ditekan, aplikasi akan membuka jendela permainan Flappy Bird yang baru dan menutup jendela menu utama.  

- **Transisi**: Memulai permainan dengan menampilkan jendela permainan.  

## Permainan Flappy Bird (FlappyBird class)

- **Tampilan**: Menampilkan gambar latar belakang, burung, dan pipa-pipa yang bergerak dari kanan ke kiri.  

- **Pergerakan Burung**: Pemain dapat menggerakkan burung dengan menekan tombol spasi untuk melompat, dipengaruhi oleh gravitasi.  

- **Pipa**: Pipa muncul secara otomatis dengan interval dan bergerak dari kanan ke kiri layar.  

- **Tabrakan**: Memeriksa apakah burung bertabrakan dengan pipa atau jatuh ke bawah layar.  

- **Skor**: Skor meningkat ketika burung melewati pipa. Skor ditampilkan di atas layar.  

- **Game Over**: Ketika burung menabrak pipa atau jatuh ke bawah, game over ditampilkan dengan opsi untuk merestart permainan.  

## Objek Pipa (Pipe class)

- **Posisi dan Ukuran**: Menyimpan posisi, ukuran, dan gambar pipa.  

- **Kecepatan Gerak**: Pipa bergerak dari kanan ke kiri dengan kecepatan tetap.  

- **Status Dilewati**: Menyimpan status apakah pipa sudah dilewati burung untuk menambah skor.  

## Objek Pemain (Player class)

- **Posisi dan Ukuran**: Menyimpan posisi, ukuran, dan gambar burung.  

- **Kecepatan Vertikal**: Burung memiliki kecepatan vertikal yang dipengaruhi oleh gravitasi dan dapat melompat ketika pemain menekan tombol spasi.  

- **Mekanisme Pergerakan**: Burung akan turun secara otomatis (karena gravitasi) dan melompat jika tombol spasi ditekan.  

# Alur Program

## 1. Memulai Aplikasi

- Program dimulai dengan menampilkan menu utama.  

- Menu utama berisi tombol "Mulai Game".  

- Ketika tombol "Mulai Game" ditekan, jendela menu utama ditutup dan permainan dimulai dengan menampilkan tampilan permainan Flappy Bird.  

## 2. Memulai Game

- Permainan dimulai dengan tampilan permainan yang berisi burung, pipa, dan latar belakang.  

- Pemain dapat mengontrol pergerakan burung menggunakan tombol spasi untuk melompat.  

- Pipa muncul secara otomatis dan bergerak dari kanan ke kiri layar.  

## 3. Mekanisme Game

- Burung dipengaruhi oleh gravitasi yang membuatnya turun secara otomatis, dan pemain dapat membuatnya melompat dengan menekan tombol spasi.  

- Pipa bergerak secara horizontal dengan kecepatan tetap dari kanan ke kiri layar.  

- Skor bertambah ketika burung berhasil melewati pipa, yang ditandai dengan pipa yang sudah dilewati (status dilewati).  

- Permainan terus berlanjut selama tidak ada tabrakan antara burung dan pipa atau burung tidak jatuh ke bawah layar.  

## 4. Game Over

- Jika burung menabrak pipa atau jatuh ke bawah layar, permainan berakhir (Game Over).  

- Setelah game over, permainan akan menampilkan notifikasi "Game Over" dengan opsi untuk merestart permainan.  

- Pemain dapat menekan tombol "R" untuk merestart permainan, yang akan mengatur ulang posisi burung dan skor, serta menampilkan permainan kembali.

# Dokumentasi

![Demo Game](ScreenRecord/ScreenRecordTP6.gif)

