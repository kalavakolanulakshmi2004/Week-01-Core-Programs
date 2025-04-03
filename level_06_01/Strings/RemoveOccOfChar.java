package Strings;
import java.util.*;
public class RemoveOccOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        String result = "";
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!=ch) {
                result += str.charAt(i);
            }
        }
        System.out.println("Modified String: " + result);
    }
}
