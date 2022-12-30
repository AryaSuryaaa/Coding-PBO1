public class Eksepsi {
    public void cetak() {
        try {
            String[] kota = {"Jakarta" ,"Bandung" ,"Demak"};

            for(int i = 0; i <= 5; i++) {
                System.out.println(kota[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage() );
        }
    }
    public static void main(String[] args) {
        Eksepsi eks = new Eksepsi();
        eks.cetak();
    }
}

