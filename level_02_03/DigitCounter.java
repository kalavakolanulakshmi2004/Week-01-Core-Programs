import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1; 
        } else {
            while (number != 0) {
                number /= 10; 
                count++;      
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
