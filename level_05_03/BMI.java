package level3;
import java.util.*;
public class BMI {
    public static String[][] ComputeBmi(int[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double heightInM = data[i][1] / 100.0;
            double bmi = data[i][0] / (heightInM * heightInM);
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void displayResults(String[][] result) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + result[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextInt();
            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextInt();
        }
        displayResults(ComputeBmi(data));
    }
}
