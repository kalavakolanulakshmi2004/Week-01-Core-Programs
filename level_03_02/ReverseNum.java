import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10; 
            number /= 10;           
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
