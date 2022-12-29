package slide5;

public class MyDate {
    public int day;
    public int month;
    public int year;

    void setDay(int dd) {
        if(month == 2) {
            if (dd > 28) {
                System.out.println("Invalid day...");
            } else {
                day = dd;
            }
        } else {
            if (dd > 31) {
                System.out.println("Invalid day...");
            } else {
                day = dd;
            }
        }
    }
    public int getDay() {
        return day;
    }
}
