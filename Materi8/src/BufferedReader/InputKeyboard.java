package BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputKeyboard {
    public static void main(String[] args) throws IOException {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        int umur = 0;

        System.out.print("Input Nama : ");
        name = dataIn.readLine(); //input nama user
        try {
            System.out.print("Input Umur : "); //cek inputan umur user
            umur = Integer.parseInt(dataIn.readLine()); //mengubah format ke integer

        } catch (Exception e) {
            System.out.println("\nEror : Umur yang anda masukan bukan angka!!!");
        };

        System.out.println("\nNama saya " + name + ", berumur " + umur + " tahun, salam kenal!");
    }
}

