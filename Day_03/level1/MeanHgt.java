import java.util.Scanner;
public class MeanHgt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;  
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter heigt of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];  
        }
        double mean = sum / 11;
        System.out.printf("The mean height of the football team is: "+String.format("%.2f",mean));
        input.close();
    }
}

