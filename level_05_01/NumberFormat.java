package level1;
import java.util.*;
public class NumberFormat {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input for conversion - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.next();
        // generateException(input);
        handleException(input);
    }
}
