import java.util.Scanner;
public class Equation {
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; 
        double slope = (y2 - y1) / (x2 - x1); 
        double intercept = y1 - (slope * x1); 
        result[0] = slope;
        result[1] = intercept;   
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance between points: " + distance);
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
    }
}

