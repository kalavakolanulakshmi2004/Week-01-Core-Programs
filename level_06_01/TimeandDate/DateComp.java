package TimeandDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter first date (dd-MM-yyyy): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);
        System.out.print("Enter second date (dd-MM-yyyy): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
