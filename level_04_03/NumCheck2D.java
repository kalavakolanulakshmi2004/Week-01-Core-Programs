package level3;
import java.util.*;
public class NumCheck2D {
    public static int countDigits(int num) {
        int count=0;
        if(num==0){
            return 1;
        }
        while(num != 0){
            num/=10;
            count++;
        }
        return count;
    }
    public static int[] digitsArr(int num) {
        int count =countDigits(num);
        int[] digits = new int[count];
        for(int i=count-1;i>=0;i--){
            digits[i] = num%10;
            num/=10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int num) {
        int[] digits = digitsArr(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] findDigitFrequency(int num) {
        int[] digits = digitsArr(num);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count=countDigits((num));
        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Digits in the number: ");
        int[] digits = digitsArr(num);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nSum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + (isHarshadNumber(num) ? "Yes" : "No"));
        System.out.println("Digit Frequency:");
        int[][] frequency = findDigitFrequency(num);
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
