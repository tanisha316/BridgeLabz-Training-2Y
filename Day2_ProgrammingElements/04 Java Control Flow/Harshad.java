import java.util.*;
public class Harshad {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int org=number;
    int summ=0;
    while(org!=0){
        int rem=org%10;
         org=org/10;
            summ+=rem;
        }
        if(number%summ==0){
            System.out.println("harshad number");
        }
        else{
            System.out.println("not harshad number");
        }


    }
}    

