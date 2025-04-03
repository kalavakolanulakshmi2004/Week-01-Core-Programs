package level1;
import java.util.*;
public class SumNatural {
    public static int sumOfNaturalNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = sumOfNaturalNum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }
}