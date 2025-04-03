package level2;
import java.util.*;
public class ShortLongSplit {
    public static int findStringLength(String s) {
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
    public static String[] splitText(String text) {
        int length = findStringLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        return words;
    }
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return result;
    }
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordsWithLengths[i][0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordsWithLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[][] wordsWithLengths = wordsWithLengths(splitText(text));
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
    }
}
