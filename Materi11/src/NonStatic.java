public class NonStatic {
    String kalimat = "mencetak Nested Class";

    class NonStaticInnerClass {
        void cetak() {
            System.out.println(kalimat);
        }
    }
}



