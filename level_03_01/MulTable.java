import java.util.Scanner;
public class MulTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        input.close();
    }
}
