package BuiltInFunctions;
import java.util.*;
public class GCDandLCM {
    public static int findGCD(int a, int b) {
        int gcd = 1, minNum = Math.min(a, b);
        for (int i = 1; i <= minNum; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + findLCM(num1, num2));
        scanner.close();
    }
}
