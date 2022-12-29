package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Masukan nama : ");

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}

