import java.util.*;
public class SumUsingFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number and 0 when u want to stop");
        double total=0.0;
         double number;
        while (true){
            number=sc.nextDouble();
           
            if(number==0 || number<0){
                break;
            } 
            total+=number;
        }
        System.out.println("sum = "+total);
    }
}
