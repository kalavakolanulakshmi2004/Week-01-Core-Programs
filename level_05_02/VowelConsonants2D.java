package level2;
import java.util.*;
public class VowelConsonants2D {
    public static String checkCharacterType(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacterType(text.charAt(i));
        }
        return result;
    }
    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        for (String[] row : data)
            System.out.println(row[0] + "\t\t" + row[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] result = analyzeString(text);
        displayTable(result);
    }
}
