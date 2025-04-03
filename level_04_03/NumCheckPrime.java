package level3;
import java.util.*;
public class NumCheckPrime {
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while(square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int num) {
        int square = (int) Math.pow(num,2);
        int count = 0;
        int temp = num;
        while(temp>0){
            temp/=10;
            count++;
        }
        int s= square % (int)Math.pow(10,count);
        return s == num;
    }
    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Is Prime? " + (isPrime(num) ? "Yes" : "No"));
        System.out.println("Is Neon? " + (isNeon(num) ? "Yes" : "No"));
        System.out.println("Is Spy? " + (isSpy(num) ? "Yes" : "No"));
        System.out.println("Is Automorphic? " + (isAutomorphic(num) ? "Yes" : "No"));
        System.out.println("Is Buzz? " + (isBuzz(num) ? "Yes" : "No"));
        scanner.close();
    }
}
