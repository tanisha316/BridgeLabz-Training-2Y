import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int sum=0;
        int ogno=number;
        while(ogno!=0){
            int rem=ogno%10;
            int temp=rem*rem*rem;
            ogno=ogno/10;
            sum+=temp;
        }
        if(number ==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}

