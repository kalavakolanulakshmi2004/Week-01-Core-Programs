package level1;
import java.util.*;
public class illegalArgument {
    public static String generateException(String text, int start, int end) {
        return text.substring(start, end);
    }
    public static void handleException(String text, int start, int end) {
        try {
            System.out.println("Substring: " + text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        // generateException(text, start, end);
        handleException(text, start, end);
    }
}