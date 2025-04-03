package level3;
import java.util.*;
public class FreqOfChar {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(freq[text.charAt(i)]);
                freq[text.charAt(i)] = 0;
                index++;
            }
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
            System.out.println(frequencies[i][0] + "\t\t" + frequencies[i][1]);
        }
    }
}
