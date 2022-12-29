package slide8;

public class testSiswa {
    public static void main(String[] args) {
        Siswa s = new Siswa();

        s.nrp = 100;
        s.nama = "I Kadek Arya Surya Saputra";

        System.out.println(s.getNrp());
        System.out.println("");
        s.setNrp(s.nrp);
        System.out.println("");
        s.info();
    }
}
