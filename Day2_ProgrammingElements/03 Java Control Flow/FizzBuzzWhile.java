import java.util.*;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("enter number");
        
        int number=sc.nextInt();
        if(number>0){
            while(i<=number){
                if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println(i);
                }
                i++;
            }
        }else{
            System.out.println("invalid");
        }
    }
}


