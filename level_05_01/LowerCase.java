package level1;
import java.util.*;
public class LowerCase {
    public static String convertToLower(String s) {
        char[] lower = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lower[i] = (char) (ch + 32);
            } else {
                lower[i] = ch;
            }
        }
        return new String(lower);
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String user = convertToLower(input);
        String builtIn = input.toLowerCase();
        boolean comparison = compareStrings(user, builtIn);
        System.out.println("Custom Method Output: " + user);
        System.out.println("Built-in toLowerCase() Output: " + builtIn);
        System.out.println("Results Match: " + comparison);
    }
}
