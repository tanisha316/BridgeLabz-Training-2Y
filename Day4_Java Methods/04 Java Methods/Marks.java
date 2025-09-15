import java.util.*;
public class Marks {
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; 
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); 
            scores[i][1] = 10 + random.nextInt(90); 
            scores[i][2] = 10 + random.nextInt(90); 
        }
        
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; 
        
        for (int i = 0; i < numStudents; i++) {
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
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("RollNo\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}

