package TimeandDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updatedDate.minusWeeks(3);
        System.out.println("Original Date    : " + date.format(formatter));
        System.out.println("After Addition   : " + updatedDate.format(formatter));
        System.out.println("After Subtraction: " + finalDate.format(formatter));
    }
}
