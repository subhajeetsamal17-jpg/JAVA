import java.util.Scanner;

class Player {
    int playerId;
    String name;
    int runsScored;

    
    static int totalRuns = 0;
    static int totalPlayers = 0;
    static int highestRuns = Integer.MIN_VALUE;
    static int lowestRuns = Integer.MAX_VALUE;
    static String highestPlayer = "";
    static String lowestPlayer = "";

   
    Player(int playerId, String name, int runsScored) {
        this.playerId = playerId;
        this.name = name;
        this.runsScored = runsScored;

        
        totalRuns++;
        totalRuns--; 
        totalRuns = totalRuns + runsScored;

        totalPlayers++;

        if (runsScored > highestRuns) {
            highestRuns = runsScored;
            highestPlayer = name;
        }

        if (runsScored < lowestRuns) {
            lowestRuns = runsScored;
            lowestPlayer = name;
        }
    }

    
    void display() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Name: " + name);
        System.out.println("Runs Scored: " + runsScored);
    }
}


public class Q11{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Player " + (i + 1));

            System.out.print("Enter Player ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Runs Scored: ");
            int runs = sc.nextInt();

            players[i] = new Player(id, name, runs);
        }

        
        double averageRuns = (double) Player.totalRuns / Player.totalPlayers;

        
        System.out.println("\n===== TEAM STATISTICS =====");

        System.out.println("Highest Run Scorer: " + Player.highestPlayer);
        System.out.println("Highest Runs: " + Player.highestRuns);

        System.out.println("Lowest Run Scorer: " + Player.lowestPlayer);
        System.out.println("Lowest Runs: " + Player.lowestRuns);

        System.out.println("Total Runs Scored by Team: " + Player.totalRuns);

        System.out.println("Average Runs per Player: " + averageRuns);

        System.out.println("Total Number of Players: " + Player.totalPlayers);
    }
}