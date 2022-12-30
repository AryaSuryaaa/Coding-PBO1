class outerClass {
    String kalimat = "mencetak Nested Class";

    class NonStaticInnerClass {
        void cetak() {
            System.out.println(kalimat);
        }
    }
}

public class NonStatic {
    public static void main(String[] args) {
        outerClass.NonStaticInnerClass inner = new outerClass().new NonStaticInnerClass();
        inner.cetak();
    }

}



