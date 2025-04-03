package level3;
import java.util.*;
public class NumCheckFactor {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2];
    }
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum;
    }
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }
    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int i = 0; i < factors.length; i++){
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number) {

        return sumOfFactors(number) == number;
    }
    public static boolean isAbundantNumber(int number) {

        return sumOfFactors(number) > number;
    }
    public static boolean isDeficientNumber(int number) {

        return sumOfFactors(number) < number;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += factorial(number % 10);
            number /= 10;
        }
        return sum == number;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factors: " + Arrays.toString(findFactors(number)));
        System.out.println("Greatest Factor: " + findGreatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
        System.out.println("Is Perfect Number? " + (isPerfectNumber(number) ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (isAbundantNumber(number) ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (isDeficientNumber(number) ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (isStrongNumber(number) ? "Yes" : "No"));
    }
}
