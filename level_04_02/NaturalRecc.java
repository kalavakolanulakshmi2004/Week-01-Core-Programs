package level2;
import java.util.*;
public class NaturalRecc {
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Invalid input! Please enter a natural number (n >= 1).");
            return;
        }
        int recursiveSum = sumUsingRecursion(num);
        int formulaSum = sumUsingFormula(num);
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations match. The result is correct!");
        } else {
            System.out.println("There is a mismatch in the results.");
        }
    }
}