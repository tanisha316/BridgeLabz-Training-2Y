import java.util.*;
public class Abundant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int sum=0;
    
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.print(i+",");
                sum+=i;
            }
        }
        System.out.println("\nsumm= "+sum+", number is "+number);
        if(number <sum){
            System.out.println("abundant number");
        }
        else{
            System.out.println("not abundant number");
        }
    }
}

