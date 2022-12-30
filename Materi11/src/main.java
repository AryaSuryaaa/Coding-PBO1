public class main {
    public static void main(String[] args) {
        NonStatic.NonStaticInnerClass inner = new NonStatic().new NonStaticInnerClass();
        inner.cetak();

        Static.innerClass inner2 = new Static.innerClass();
        inner2.value = 200;
        System.out.println(inner2.value);
    }
}
