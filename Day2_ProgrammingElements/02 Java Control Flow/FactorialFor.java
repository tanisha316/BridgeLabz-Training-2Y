import java.util.*;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number ");
        int factorial=1;
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
           System.out.println("factorial = "+factorial);
    }
}