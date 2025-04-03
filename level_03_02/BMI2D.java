import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();
        double[][] personData = new double[number][3];
        String[] status = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            double height = input.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid height! Enter a positive value: ");
                height = input.nextDouble();
            }
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            double weight = input.nextDouble();
            while (weight <= 0) {
                System.out.print("Invalid weight! Enter a positive value: ");
                weight = input.nextDouble();
            }
            personData[i][0] = height;
            personData[i][1] = weight;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        System.out.println("\nPerson Details:");
        System.out.println("Height (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "\t\t" +
                               personData[i][1] + "\t\t" +
                               String.format("%.2f", personData[i][2]) + "\t\t" +
                               status[i]);
        }
    }
}
