import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
         System.out.println("Enter perimeter ");
        Scanner input = new Scanner(System.in); 
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
        }
    }
