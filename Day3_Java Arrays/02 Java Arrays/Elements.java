import java.util.Scanner;
public class Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter elements");
         int arr[]=new int[10];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0 || arr[i]<0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; 
            
    }
    System.out.println(sum);
}
}
