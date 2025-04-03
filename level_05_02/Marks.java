package level2;
import java.util.*;
public class Marks {
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 50 + random.nextInt(51);
            scores[i][1] = 50 + random.nextInt(51);
            scores[i][2] = 50 + random.nextInt(51);
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        int students = scores.length;
        double[][] stats = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = percentage;
        }
        return stats;
    }
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            }
            else if (percentage >= 70 && percentage <=79) {
                grades[i] = "B";
            }
            else if (percentage >= 60 && percentage <=69) {
                grades[i] = "C";
            }
            else if (percentage >= 50 && percentage <=59) {
                {
                    grades[i] = "D";
                }
            }
            else if (percentage >= 40 && percentage <=49) {
                grades[i] = "E";
            }
            else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t"
                    + (int) stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%\t\t" + grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScoreCard(scores, stats, grades);
    }
}
