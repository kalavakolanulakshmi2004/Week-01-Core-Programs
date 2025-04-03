package level2;
import java.util.*;
public class Strlength {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int calculatedLen = findLength(input);
        int actualLen = input.length();
        System.out.println("Calculated Length: " + calculatedLen);
        System.out.println("Actual Length: " + actualLen);
    }
}
