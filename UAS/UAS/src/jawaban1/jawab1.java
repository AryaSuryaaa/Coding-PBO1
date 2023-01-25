package jawaban1;

import java.util.Scanner;

public class jawab1 {
    public static void main(String[] args) {
        int x, y, z, terbesar, terkecil;

        Scanner input = new Scanner(System.in);

        System.out.println("Menentukan Bilangan Terbesar, Terkecil dan Rata-rata");
        System.out.print("Masukkan Bilangan Pertama (x) : ");
        x = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua (y) : ");
        y = input.nextInt();
        System.out.print("Masukkan Bilangan Ketiga (z) : ");
        z = input.nextInt();

        float jumlah = x + y + z;
        float rata = jumlah / 3;

        System.out.println("Hasil");
        System.out.printf("Rata-ratanya adalah : %.15f\n", rata);

        if(x > y && x > z) {
            terbesar = x;
        } else if (y > z && y > x) {
            terbesar = y;
        } else {
            terbesar = z;
        }

        System.out.println(terbesar + " adalah bilangan terbesar");

        if (x < y && x < z) {
            terkecil = x;
        } else if (y < x && y < z) {
            terkecil = y;
        } else {
            terkecil = z;
        }

        System.out.println(terkecil + " adalah bilangan terkecil");
    }
}