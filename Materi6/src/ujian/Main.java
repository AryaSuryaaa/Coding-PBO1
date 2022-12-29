package ujian;

public class Main {
    public static void main(String[] args) {
        String obj = "I Like java";
        System.out.println(obj.length());

        int arr[] = {1, 2,3,4,5};
        for (int i = 0; i < arr.length - 2; ++i) {
            System.out.println(arr[i] + " ");
        }

        int g = 3;
        System.out.println(++g * 8);
    }
}
