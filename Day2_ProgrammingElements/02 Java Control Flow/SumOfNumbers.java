import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number and 0 when u want to stop");
        double total=0.0;
        double number=sc.nextDouble();

        while(number>0){
            total+=number;
            number=sc.nextDouble();
        }
           System.out.println("sum = "+total);
    }
}