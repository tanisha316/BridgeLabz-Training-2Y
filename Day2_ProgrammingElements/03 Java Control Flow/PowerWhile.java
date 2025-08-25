import java.util.*;
public class PowerWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number and power");
        int number=sc.nextInt();
        int power=sc.nextInt();
        int result=1;
        int i=1;
        if(number>0){
            while(i<=power){
                result=number*result;
                i++;
            }
            System.out.println("result= "+result);

        }
    }
}
