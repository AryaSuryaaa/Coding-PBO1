public class Main {
    public static void main(String[] args) {

        String a = "*";
        for(int i = 1; i <= 10; i++) {
            System.out.print(a);
            if (i == 1) {
                for(int c = 1; c <= 7; c++) {
                    System.out.print(a);
                }
            }
            if (i == 5) {
                for(int c = 1; c <= 7; c++) {
                    System.out.print(a);
                }
            }
            System.out.println("");
        }
    }
}