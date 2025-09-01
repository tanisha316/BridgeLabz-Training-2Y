import java.util.Scanner;
public class StudentVote {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentAges = new int[10];
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") CAN vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") CANNOT vote.");
            }
        }
    }
}
