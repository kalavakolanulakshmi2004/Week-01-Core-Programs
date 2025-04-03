package level1;
import java.util.*;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            int maxHandshakes = (n * (n - 1)) / 2;
            System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);
        }
    }
}
