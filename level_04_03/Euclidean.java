package level3;
import java.util.*;
public class Euclidean {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static String findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) return "x = " + x1;
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return "y = " + m + "x + " + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();
        System.out.println("Euclidean Distance: " + calculateDistance(x1, y1, x2, y2));
        System.out.println("Equation of the line: " + findLineEquation(x1, y1, x2, y2));
    }
}
