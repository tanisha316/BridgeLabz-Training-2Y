import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{
        System.out.print("Enter base in inches ");
        double base = input.nextDouble();
        System.out.print("Enter height in inches ");
        double height = input.nextDouble();
        double areainInches = 0.5 * base * height;
        double baseinCm = base * 2.54;
        double heightinCm = height * 2.54;
        double areainCm = 0.5 * baseinCm * heightinCm;
        System.out.printf("The area of the triangle is square inches and square centimeters "+ areainInches+" and "+areainCm);
        
        }
    }
}

