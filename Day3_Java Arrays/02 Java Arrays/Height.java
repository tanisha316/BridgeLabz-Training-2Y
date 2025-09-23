import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter heights");
        double arr[]=new double[11];
        double sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
        }
        double avg=sum/11;
        System.out.println(avg);
        }
}
