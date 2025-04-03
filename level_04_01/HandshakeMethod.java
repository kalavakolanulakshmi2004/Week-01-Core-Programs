package level1;
import java.util.*;
public class HandshakeMethod {
    public static void calculateHandshakes(int n) {
        int maxHandshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum no.of handshakes among " + n + " students is: " + maxHandshakes);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            calculateHandshakes(n);
        }
    }
}
