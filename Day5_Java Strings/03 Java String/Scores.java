import java.util.Scanner;
public class Scores {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; 
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; 
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static String[] calculateGrade(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i] = "A";
            else if (percentage >= 80) grades[i] = "B";
            else if (percentage >= 70) grades[i] = "C";
            else if (percentage >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nS.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + 
                               scores[i][0] + "\t" + 
                               scores[i][1] + "\t\t" + 
                               scores[i][2] + "\t" + 
                               (int)results[i][0] + "\t" + 
                               results[i][1] + "\t" + 
                               results[i][2] + "%\t\t" + 
                               grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrade(results);

        displayScoreCard(scores, results, grades);

        sc.close();
    }
}
