package passbyreference;

public class TestPassByRef {
    public static void main(String[] args) {
//        Membuat array integer
        int ages[] = {10, 11, 12};

//        Mencetak nilai array
        for(int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        test(ages);

        for(int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }

    public static void test (int[] arr) {
//        Merubah nilai array
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 50;
        }
    }
}
