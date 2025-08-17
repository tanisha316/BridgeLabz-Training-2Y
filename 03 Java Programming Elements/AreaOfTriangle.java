import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base ");
        double baseinInches = sc.nextDouble();
        System.out.print("Enter height ");
        double heightinInches = sc.nextDouble();
        double areainInches = 0.5 * baseinInches * heightinInches;
        double baseinCm = baseinInches * 2.54;
        double heightinCm = heightinInches * 2.54;
        double areainCm = 0.5 * baseinCm * heightinCm;
        System.out.println("The Area of the triangle is sq in is "+areainInches+" and sq cm is "+ areainCm);

        }
    }
