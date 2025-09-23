import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter positive number");
        int number=sc.nextInt();
        int summ= number*(number+1)/2;
        if(number>0){
        System.out.println("the sum of "+number+"natural numbers is"+summ);
        }
        else{
            System.out.println("the number "+number+" is not a natural number");
        }    
    }
}
