package BuiltInFunctions;
import java.util.*;
public class Fibonacci {
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1, next;
        System.out.print("Fibonacci Sequence: " + first + " " + second + " ");
        for (int i = 2; i <= terms; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        if (terms < 1) {
            System.out.println("Please enter a positive number.");
        } else if (terms == 1) {
            System.out.println("Fibonacci Sequence: 0");
        } else {
            generateFibonacci(terms);
        }
    }
}
