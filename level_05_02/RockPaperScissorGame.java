package level2;
import java.util.*;
public class RockPaperScissorGame {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int) (Math.random() * 3)];
    }
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins"; stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Winning %";
        stats[2][1] = String.format("User: %.2f%%, Computer: %.2f%%",
                (userWins * 100.0 / totalGames), (computerWins * 100.0 / totalGames));
        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < results.length; i++)
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        System.out.println("\nStatistics:");
        for (String[] row : stats) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[games][3];
        int userWins = 0, computerWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
            }
            else if (winner.equals("Computer")) {
                computerWins++;
            }
            results[i] = new String[]{userChoice, computerChoice, winner};
        }
        displayResults(results, calculateStats(userWins, computerWins, games));
    }
}