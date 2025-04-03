package BuiltInFunctions;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindrome(input))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is NOT a palindrome.");
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}