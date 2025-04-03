package level1;
import java.util.*;
public class toCharArr {
    public static char[] getCharacters(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            chars[i] = s.charAt(i);
        return chars;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i]) {
                return false;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        char[] userDefinedArray = getCharacters(str);
        char[] builtInArray = str.toCharArray();
        boolean comparison = compareArrays(userDefinedArray, builtInArray);
        System.out.print("User-defined method output: ");
        for (char c : userDefinedArray)
            System.out.print(c + " ");
        System.out.print("\ntoCharArray() method output: ");
        for (char c : builtInArray)
            System.out.print(c + " ");
        System.out.print("\nResults match: " + comparison);
    }
}
