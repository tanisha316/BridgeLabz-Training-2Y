import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 5 numbers");
        int arr[]= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]>0 && arr[i]%2==0){
            System.out.println("positive even number");
        }
        if(arr[i]>0 && arr[i]%2!=0){
            System.out.println("positive odd no.");
        }
        if(arr[i]<0){
            System.out.println("negative no.");
        }
        else if(arr[i]==0){
            System.out.println("zero");
        }
    }
        if(arr[0]==arr[4]){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}

