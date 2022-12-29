package tugaspt5;

public class Main {
    public static void main(String[] args) {
        int angka = 90;
        int angka2[] = {90};

        System.out.println("========= Pass By Value =========");
        System.out.println("Nilai Awal                  : " + angka);
        value(angka);
        System.out.println("Nilai saat method dipanggil : " + angka);
        System.out.println("\n======= Pass By Reference =======");
        System.out.println("Nilai Awal                  : " + angka);
        ref(angka2);
        System.out.println("Nilai saat method dipanggil : " + angka2[0]);


    }
    // Pass By Value
    public static void value (int angka) {
        angka += 10;
        System.out.println("Nilai angka didalam method  : " + angka);
    }
    // Pass By reference
    public static void ref(int[] angka2) {
        angka2[0] += 10;

        System.out.println("Nilai angka didalam method  : " + angka2[0]);
    }
}
