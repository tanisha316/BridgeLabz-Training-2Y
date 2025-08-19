import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.printf("Your height in miles is "+miles+" while in feet is "+feet+" and yards is "+yards);

        }
    }