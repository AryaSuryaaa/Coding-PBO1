package jawaban2;

import java.util.Scanner;

public class jawab2 {
    public static void main(String[] args) {
        int result = 0, harga;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang : ");
        int banyak = input.nextInt();

        for(int i = 1; i <= banyak; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            harga = input.nextInt();
            result += harga;
        }

        System.out.println("\nTotal belanja adalah " + result);

        if(result >= 1500000) {
            System.out.println("Mendapat bonus Setrika");
        } else if (result >= 1000000 && result < 1500000) {
            System.out.println("Mendapat bonus Payung");
        } else if (result >= 500000 && result < 1000000) {
            System.out.println("Mendapat bonus Ballpoint");
        }
    }
}
