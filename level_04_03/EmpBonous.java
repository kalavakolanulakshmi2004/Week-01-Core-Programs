package level3;
import java.util.*;
public class EmpBonous {
    public static int[][] generateData(int n) {
        int[][] data = new int[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            result[i][0] = data[i][0] + (data[i][0] * bonusRate);
            result[i][1] = data[i][0] * bonusRate;
        }
        return result;
    }
    public static void displayData(int[][] data, double[][] updatedData) {
        double oldSum = 0, newSum = 0, totalBonus = 0;
        System.out.println("Emp | Old Salary | Years | Bonus  | New Salary ");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "    | " + data[i][0] + "     | " + data[i][1] + "     | " + String.format("%.2f", updatedData[i][1]) + "  | " + String.format("%.2f", updatedData[i][0]));
            oldSum += data[i][0];
            newSum += updatedData[i][0];
            totalBonus += updatedData[i][1];
        }
        System.out.println("\nTotal | " + oldSum + "  |      | " + String.format("%.2f", totalBonus) + "  | " + String.format("%.2f", newSum));
    }
    public static void main(String[] args) {
        int[][] employeeData = generateData(10);
        double[][] updatedData = calculateBonus(employeeData);
        displayData(employeeData, updatedData);
    }
}
