package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.print("Input Nama : ");
        String nama = inputData.nextLine();

        System.out.print("Input Usia : ");
        int usia = inputData.nextInt();

        System.out.println("\nData yang dimasukkan :");
        System.out.println("Nama : " +nama);
        System.out.println("Usia : " +usia);
    }
}

