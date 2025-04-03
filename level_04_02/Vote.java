package level2;
import java.util.*;
public class Vote {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") cannot vote.");
            }
        }
    }
}
