import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
        System.out.println("even");
        for(int i=0;i<=number;i++){
            
            if(i%2==0){
                System.out.println(i);
            }
            
        }
        System.out.println("odd");
        for(int i=0;i<=number;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    }
}