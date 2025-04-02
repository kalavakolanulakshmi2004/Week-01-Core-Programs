import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        if (n > 0) {
		int i=1;
            while(i<=n) {
                String result = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz"
                             : (i % 3 == 0) ? "Fizz"
                             : (i % 5 == 0) ? "Buzz"
                             : Integer.toString(i);

                System.out.println(result);
				i++;
            }
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }
    }
}
