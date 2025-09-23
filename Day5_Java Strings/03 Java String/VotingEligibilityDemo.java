import java.util.Random;
import java.util.Scanner;
public class VotingEligibilityDemo {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); 

            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; 
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }
    public static void displayTable(String[][] arr) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("-----------------");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.println("Generating random ages for " + n + " students...");
        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);
        displayTable(result);

        sc.close();
    }
}
