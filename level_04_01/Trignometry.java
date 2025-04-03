package level1;
import java.util.*;
public class Trignometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of " + angle + "°: " + result[0]);
        System.out.println("Cosine of " + angle + "°: " + result[1]);
        System.out.println("Tangent of " + angle + "°: " + result[2]);

        sc.close();
    }
}
