import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        System.out.println("Person Details:");
        System.out.println("Height(m) | Weight(kg) | BMI  | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(heights[i] + "\t    " + weights[i] + "\t      " + String.format("%.2f", bmis[i]) + "\t  " + status[i]);
        }
    }
}
