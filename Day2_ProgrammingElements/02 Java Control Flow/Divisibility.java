import java.util.*;
public class Divisibility{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int number =sc.nextInt();
        System.out.println("is the number "+number+" divisible by 5?");
        if(number%5==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    }
