import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number > 1) {
            int greatestFactor = 1;  
            int counter = number - 1;  
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;  
                    break;  
                }
                counter--;  
            }
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1.");
        }
    }
}
