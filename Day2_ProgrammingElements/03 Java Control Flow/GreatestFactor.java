import java.util.*;
public class GreatestFactor {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int greatestFactor=1;
    if(number>0){
         System.out.println("gfactor");
        for(int i=number;i>1;i--){
            if(number%i==0){
                greatestFactor=i;
                System.out.println(greatestFactor);
                break;
            }
        }
    }
    else{
        System.out.println("invalid");
    }
  }    
    
}
