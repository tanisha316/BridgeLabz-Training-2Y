import java.util.Scanner;

public class Triangle {
    public static double calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides must be positive numbers.");
            return;
        }


        double totalDistance = 5000;


        double rounds = calculateRounds(side1, side2, side3, totalDistance);

        
        System.out.println("Perimeter of the park: " + (side1 + side2 + side3) + " meters");
        System.out.println("Exact rounds required: " + rounds);
        System.out.println("Minimum whole rounds to complete 5 km: " + (int)Math.ceil(rounds));

        sc.close();
    }
}
