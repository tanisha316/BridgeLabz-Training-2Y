import java.util.Scanner;
public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        switch (user) {
            case "rock":
                return (computer.equals("scissors")) ? "Player" : "Computer";
            case "paper":
                return (computer.equals("rock")) ? "Player" : "Computer";
            case "scissors":
                return (computer.equals("paper")) ? "Player" : "Computer";
        }
        return "Invalid";
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int games) {
        String[][] stats = new String[2][3]; // Player & Computer stats

        double playerPercent = (playerWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("--------------------------------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t\t" + row[3]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Name\tWins\tPercentage");
        System.out.println("----------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][4];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;
        }
        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(results, stats);

        sc.close();
    }
}
