package level3;
import java.util.Scanner;
public class FirstNonRepeat {
    public static String findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return String.valueOf(text.charAt(i));
            }
        }
        return "No Non-repeating character";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("First non-repeating character: " + findFirstNonRepeating(text));
    }
}
