import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        System.out.println("Is the first number the largest?");
        System.out.println("Is the first number the largest?");
        System.out.println("Is the first number the largest?");

        if(number1>number2 && number1>number3){
        System.out.println("yes the first number is largest");
        }
        else if(number2>number3 && number2>number1){
            System.out.println("Yes the second number is largest");
        }
        else{
            System.out.println("third number is largest");
        }
    }
}

