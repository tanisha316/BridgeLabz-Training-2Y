import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>1){
            boolean isPrime= true;
            for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime= false;
                break;
            } 
        } if(isPrime){
            System.out.println(number+" is prime no.");
            } else{
                System.out.println(number+" not prime ");
            }
         }    
          else{
        System.out.println("invalid");
     }
}
}
