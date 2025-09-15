import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        
        double[][] marks = new double[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                double m;
                do {
                    System.out.print("Enter marks for " + subject + ": ");
                    m = sc.nextDouble();
                    if (m < 0) {
                        System.out.println("Invalid marks! Please enter positive values.");
                    }
                } while (m < 0);

                marks[i][j] = m;
            }
        }


        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-8s %-6s%n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-8c %-6s%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    percentage[i], grade[i], (grade[i] != 'F' ? "Pass" : "Fail"));
        }

        sc.close();
    }
}
