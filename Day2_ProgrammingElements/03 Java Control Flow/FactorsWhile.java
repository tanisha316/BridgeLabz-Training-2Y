import java.util.*;
public class FactorsWhile {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int i=1;
    if(number>0){
         System.out.println("factors");
        while(i<number){
            if(number%i==0){
               
                System.out.println(i);
            }i++;
        }
    }
    else{
        System.out.println("invalid");
    }
  }  
}
