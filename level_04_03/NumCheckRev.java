package level3;
import java.util.*;
public class NumCheckRev {
    public static int countDigits(int num) {
        int count = 0;
        if(num == 0) {
            return 1;
        }
        while(num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static int[] digitsArr(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for(int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int num) {
        int[] digits = digitsArr(num);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int num) {
        int[] digits = digitsArr(num);
        for (int i = 1; i < digits.length; i++) {
            if(digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = countDigits(num);
        System.out.println("Number of digits: " + count);
        System.out.println("Digits in the number:");
        int[] digits = digitsArr(num);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nReversed Digits:");
        int[] reversedDigits = reverseDigitsArray(digits);
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
        System.out.println("\nIs Palindrome? " + (isPalindrome(num) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(num) ? "Yes" : "No"));
        scanner.close();
    }
}
