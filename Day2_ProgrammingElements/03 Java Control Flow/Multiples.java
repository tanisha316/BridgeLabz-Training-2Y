import java.util.*;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int multiple;
        if(number>0 && number <100){
            for(int i=1;i<100;i++){
                    multiple=i*number;
            
                System.out.println("Multiples= "+multiple);
            }
        }
    else{
        System.out.println("invalid");
    }
    }
}


