import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                String result = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz"
                             : (i % 3 == 0) ? "Fizz"
                             : (i % 5 == 0) ? "Buzz"
                             : Integer.toString(i);

                System.out.println(result);
            }
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }
    }
}
