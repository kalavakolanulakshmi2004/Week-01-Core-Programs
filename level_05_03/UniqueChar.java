package level3;
import java.util.*;
public class UniqueChar {
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
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
                uniqueTemp[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueTemp[i];
        }
        return uniqueChars;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
    }
}
