package BuiltInFunctions;
import java.util.*;
public class FactReccursion {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }
    public static void main(String[] args) {
        int num = getInput();
        long result = factorial(num);
        displayResult(num, result);
    }
}
