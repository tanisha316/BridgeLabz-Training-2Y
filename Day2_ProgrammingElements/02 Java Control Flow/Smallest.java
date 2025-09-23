import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        System.out.println("Is the first number the smallest?");
        if(number1<number2 && number1<number3){
        System.out.println("yes the first number is smallest");
        }
        else{
            System.out.println("No");
        }
    }
}
