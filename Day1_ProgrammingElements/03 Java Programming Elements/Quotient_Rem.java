import java.util.*;
public class Quotient_Rem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no.");
        int number1=sc.nextInt();
        System.out.println("enter 2nd no. ");
        int number2= sc.nextInt();
        int quotient= number1/number2;
        int remainder= number1%number2;
        System.out.println("The Quotient is "+quotient+" and remainder is "+remainder+" of two number "+number1+" and "+number2);

    }
}
