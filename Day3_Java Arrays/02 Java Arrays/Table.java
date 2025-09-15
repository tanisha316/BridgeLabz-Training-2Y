import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.");
        int number=sc.nextInt();
        int arr[]=new int[11];
        for(int i=1;i<=(arr.length+1);i++){
             arr[i]=number*i;
            System.out.print(arr[i]);
    }
}
}

