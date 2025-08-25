import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int factorial=1;
        int i=1;
        double number=sc.nextDouble();
        if(number>0){
        while(i<=number){
            factorial*=i;
            i++;
        }
           System.out.println("factorial = "+factorial);
    }
}
}