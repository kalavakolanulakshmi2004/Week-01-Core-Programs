package level3;
import java.util.*;
public class FreqOfCharLoops {
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] frequency = new int[length];
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
        }
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }
        int uniqueCount = 0;
        for (char c : chars) {
            if (c != '0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + frequency[i];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] frequencies = findFrequency(text);
        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }
    }
}
