package level3;
import java.util.*;
public class TallShort {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[11];
        System.out.println("Enter the heights (in cm) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }
        System.out.println("\nPlayer Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nShortest Player Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallestHeight(heights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(heights) + " cm");
    }
}
