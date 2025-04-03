package level2;
import java.util.*;
public class Trim {
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        while (end > start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] trimIndices = findTrimIndices(text);
        String customTrimmed = customSubstring(text, trimIndices[0], trimIndices[1]);
        String builtInTrimmed = text.trim();
        System.out.println("Custom Trimmed: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtInTrimmed + "\"");
        System.out.println("Results match: " + compareStrings(customTrimmed, builtInTrimmed));
    }
}
