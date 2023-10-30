# Proyek Perhitungan Bilangan Prima

Proyek ini adalah contoh sederhana untuk mengidentifikasi dan menghitung bilangan prima dalam suatu rentang tertentu. Dengan menggunakan kelas `BilanganPrima`, Anda dapat dengan mudah memeriksa apakah suatu angka adalah bilangan prima dan juga mencari semua bilangan prima dalam suatu rentang angka.

## Cara Menjalankan Proyek

1. Pastikan Anda memiliki lingkungan pengembangan Java yang sudah terinstal di komputer Anda.

2. Unduh atau klon proyek ini ke komputer Anda.

3. Buka proyek menggunakan editor Java favorit Anda.

4. Buka kelas `BilanganPrima.java` dan jalankan program dari sana.

5. Anda akan diminta untuk memasukkan angka awal dan akhir rentang. Program akan menampilkan daftar bilangan prima dalam rentang tersebut.

## Cara Menggunakan Kelas `BilanganPrima`

Anda juga dapat menggunakan kelas `BilanganPrima` dalam proyek Java Anda sendiri dengan mengimpor kelas tersebut dan memanggil metodenya seperti berikut:

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int awal = 10;
        int akhir = 50;

        List<Integer> bilanganPrima = BilanganPrima.cariPrimaDalamRentang(awal, akhir);

        System.out.println("Bilangan prima dalam rentang " + awal + " sampai " + akhir + ":");
        for (int prima : bilanganPrima) {
            System.out.print(prima + " ");
        }
    }
}