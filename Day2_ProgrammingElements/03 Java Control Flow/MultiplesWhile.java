import java.util.*;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int multiple;
        int i=1;
        if(number>0 && number <100){
            while(i<100){
                    multiple=i*number;
            
                System.out.println("Multiples= "+multiple);
          i++;
            }
        }
    else{
        System.out.println("invalid");
    }
    }
}


