import java.util.*;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a,b,c in double datatype");
        double a=sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        System.out.println("The results of Int Operations are "+(a+b*c)+" , "+(a*b+c)+" , "+(c+a/b)+" and "+(a%b+c));
    }
}

