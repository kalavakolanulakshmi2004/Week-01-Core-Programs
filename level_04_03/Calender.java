package level3;
import java.util.*;
public class Calender {
    public static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + getMonthName(month) + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);
        String row = "";
        for (int i = 0; i < firstDay; i++) row += "     ";
        for (int day = 1; day <= daysInMonth; day++) {
            row += String.format("%5d", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println(row);
                row = "";
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        displayCalendar(month, year);
    }
}
