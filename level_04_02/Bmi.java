package level2;
import java.util.*;
public class Bmi {
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < bmiData.length; i++) {
            double weight = bmiData[i][0];
            double heightMeters = bmiData[i][1] / 100;
            bmiData[i][2] = weight / (heightMeters * heightMeters);
        }
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi >= 18.5 &&  bmi < 24.9) return "Normal weight";
        else if (bmi >=25.0 && bmi < 29.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] bmiData = new double[10][3];
        String[] bmiStatus = new String[10];
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            bmiData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            bmiData[i][1] = scanner.nextDouble();
        }
        calculateBMI(bmiData);
        for (int i = 0; i < bmiData.length; i++) {
            bmiStatus[i] = getBMIStatus(bmiData[i][2]);
        }
        System.out.println("\nBMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println((i + 1) + "\t" + String.format("%.2f", bmiData[i][0]) + "\t\t" +
                    String.format("%.2f", bmiData[i][1]) + "\t\t" +
                    String.format("%.2f", bmiData[i][2]) + "\t" + bmiStatus[i]);
        }
    }
}
