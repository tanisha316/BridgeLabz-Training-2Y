import java.util.*;
public class Power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number and power");
        int number=sc.nextInt();
        int power=sc.nextInt();
        int result=1;
        if(number>0){
            for(int i=1;i<=power;i++){
                result=number*result;
            }
            System.out.println(result);

        }
    }
}