import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args){
         System.out.print("Enter perimeter ");
         Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        }
    }
