import java.util.*;

public class dayOfProgrammer {

    static String dayOfProgrammer(int year) {

        if (year == 1918) return "26.09.1918";

        boolean leap;

        if (year < 1918)
            leap = year % 4 == 0;   // Julian calendar
        else
            leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0); // Gregorian

        return (leap ? "12.09." : "13.09.") + year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(dayOfProgrammer(year));
    }
}
