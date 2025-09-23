import java.util.*;
public class GreatestFactorWhile {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int greatestFactor=1;
    int i=number;
    if(number>0){
         System.out.print("gfactor=");
        while(i>1){
            if(number%i==0){
                greatestFactor=i;
                System.out.print(greatestFactor);
                break;
            }i--;
        }
    }
    else{
        System.out.println("invalid");
    }
  }    
    
}
