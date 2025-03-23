import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = { "Rock", "Paper", "Scissors" };
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors"))
                || (userChoice.equalsIgnoreCase("paper") && computerChoice.equals("Rock"))
                || (userChoice.equalsIgnoreCase("Scissor") && (computerChoice.equals("Paper")))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalWins) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Winds";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "User Win Percentage";
        stats[2][1] = String.format("%.2f%%", ((double) userWins / totalWins) * 100);
        return stats;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nGame Statistics");
        System.out.println("----------------");
        for (String[] row : results) {
            System.out.printf("%s: %s%n", row[0], row[1]);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Games: ");
        int numberOfGames = input.nextInt();
        input.nextLine();

        int userWins = 0, computerWins = 0;
        for (int i = 0; i < numberOfGames; i++) {
            System.out.println("Enter Your Choice(Rock, Paper, Scissors): ");
            String userChoice = input.nextLine();
            String computerChoice = getComputerChoice();
            System.out.println("Computer's Choice: " + computerChoice);
            String winner = determineWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            System.out.println("Winner: " + winner);
        }
        input.close();
    }
}
