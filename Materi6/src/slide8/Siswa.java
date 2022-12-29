package slide8;

public class Siswa {
    public int nrp;
    public String nama;

    public void setNrp(int n) {
        if(n >= 1 && n <= 10) {
            nrp = n;
        } else {
            System.out.println("Diluar nalar...");
        }
    }

    public int getNrp() {
        return nrp;
    }
    public void info() {
        System.out.println("Mahasiswa ganteng\n" + nrp + " " + nama);
    }
}
