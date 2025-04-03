package level3;
import java.util.*;
public class FreqofCharUnique {
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueTemp = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == text.charAt(i)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueTemp[uniqueCount++] = text.charAt(i);
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueTemp[i];
        }
        return uniqueChars;
    }
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] frequencies = findFrequency(text);
        System.out.println("Character\tFrequency");
        for (int i=0;i<frequencies.length;i++) {
            System.out.println(frequencies[i][0] + "\t\t\t" + frequencies[i][1]);
        }
    }
}
