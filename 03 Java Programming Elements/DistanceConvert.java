import java.util.*;
public class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.printf("Your height in miles is "+miles+" while in feet is "+feet+" and yards is "+yards);

        }
    }

