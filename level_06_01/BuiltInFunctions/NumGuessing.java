package BuiltInFunctions;
import java.util.*;
public class NumGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        playGame(sc);
    }
    public static void playGame(Scanner sc) {
        int low = 1, high = 100, guess;
        String feedback;
        Random rand = new Random();
        while (low <= high) {
            guess = low + rand.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
            feedback = sc.next().toLowerCase();
            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                return;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }
        System.out.println("Oops! Something went wrong. Are you sure about your responses?");
    }
}