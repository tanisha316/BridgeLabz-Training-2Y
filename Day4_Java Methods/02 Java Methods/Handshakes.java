import java.util.Scanner;

public class Handshakes {


    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

               if (numberOfStudents < 2) {
            System.out.println("At least 2 students are needed for a handshake.");
        } else {
        
            int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of possible handshakes: " + handshakes);
        }

        sc.close();
    }
}
