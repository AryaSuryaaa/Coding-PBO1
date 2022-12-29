/*
Nama    : I Kadek Arya Surya Saputra
Kelas   : TIF RP21C
NPM     : 21552011227
Matkul  : PBO I (Tugas)
*/
// merupakan sintaks untuk membuat komentar lebih dari satu baris

import java.util.Scanner; //Mengambil utilitas yang sudah tersedia di java (Scanner)

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Membuat variabel untuk menampung nilai input

        int pilih; // membuat variabel pilih untuk menampung nilai pilihan user
        System.out.println("Menu Nilai dan Ketentuan");
        System.out.println("1. Cek nilai"); //println menampilkan teks dengan baris baru
        System.out.println("2. Ketentuan nilai");
        System.out.print("Masukkan angka sesuai dengan menu di atas : "); //System.out.print digunakan untuk menampilkan
                                                                         //teks tanpa baris baru
        pilih = input.nextInt(); //penginputan nilai oleh user

        switch (pilih) { //switch merupakan statement perbandingan dimana nilai yang dibandingkan merupakan nilai dari
                         // variabel pilih (inputan user)
            case 1 : // Jika nilai yang di input 1 maka akan menampilkan program cek nilai
                int nilai;
                System.out.print("Masukkan nilai Kamu : ");
                nilai = input.nextInt();

                if (nilai >= 85 && nilai <= 100) {  //if else if statement adalah statement untuk perbandingan
                                                    //Jika perbandingan pertama tidak sesuai maka akan dibandingkan
                                                    // dengan else if dan seterusnya
                    System.out.println("Selamat! Kamu mendapatkan grade A");
                } else if (nilai >= 80 && nilai <= 84) {
                    System.out.println("Kamu mendapatkan grade AB");
                } else if (nilai >= 75 && nilai <= 79) { //Menggunakan operator logika && untuk mengecek nilai
                                                         //terhadap 2 atau lebih situasi
                    System.out.println("Kamu mendapatkan grade B");
                } else if (nilai >= 70 && nilai <= 74) {
                    System.out.println("Kamu mendapatkan grade BC");
                } else if (nilai >= 60 && nilai <= 69) {
                    System.out.println("Kamu mendapatkan grade C, Yuk lebih giat lagi belajarnya");
                } else if (nilai >= 50 && nilai <= 59) {
                    System.out.println("Kamu mendapatkan grade D, Perbaiki nilainya ya!!!");
                } else if (nilai >= 0 && nilai <= 49) {
                    System.out.println("Kamu mendapatkan grade E, Lebih Semangat lagi Kuliahnya!!");
                } else { //else adalah nilai default yang akan ditampilkan jika diseluruh perbandingan tidak seusai
                    System.out.println("Nilai yang diinput salah. Masukan nilai 0-100");
                }
                break; //break berfungsi untuk memberhentikan program agar tidak lanjut ke case berikutnya
            case 2 : //jika di menu awal user memilih menu 2, maka program di ketentuan nilai akan dijalankan
                System.out.println("Nilai 85 - 100 = A\n" +
                        "Nilai 80 - 84  = AB\n" +
                        "Nilai 75 - 79  = B\n" + //Menggunakan Operator Concate (+) untuk menggabungkan dua buah string
                        "Nilai 75 - 79  = B\n" +
                        "Nilai 70 - 74  = B\n" +
                        "Nilai 60 - 69  = B\n" +
                        "Nilai 50 - 59  = B\n" +
                        "Nilai 0 - 49   = B\n"
                );
                break;
            default: //sama seperti else, nilai default yang akan ditampilkan jika diseluruh perbandingan tidak seusai
                System.out.println("Hanya tersedia 2 menu saja!!!");
        }

    }
}