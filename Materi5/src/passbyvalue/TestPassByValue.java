package passbyvalue;

public class TestPassByValue {
    public static void main(String[] args) {
        int i = 10;
        String a = "Surya";

//        Mencetak nilai i
        System.out.println(i);
//        System.out.println(a);

//        memanggil method test
//        passing i pada method test
        test(i);
        ganti(a);

//        mencetak nilai i
//        System.out.println(i);
//        System.out.println(a);
    }
    public static void test (int j) {
//            Merubah nilai parameter j
        j  = 50;
    }
    public static void ganti (String a) {
        a = "Hallo " + a;
    }
}
