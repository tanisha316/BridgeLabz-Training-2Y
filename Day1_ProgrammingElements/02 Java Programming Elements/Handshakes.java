 import java.util.Scanner;
    public class Handshakes {
    public static void main(String[] args) {
        System.out.print("enter number of students ");
        Scanner input = new Scanner(System.in);        
        int numberofStudents = input.nextInt();
        int handshakes = (numberofStudents * (numberofStudents - 1)) / 2;
        System.out.println("The number of possible handshakes are " + handshakes);
        }
    }