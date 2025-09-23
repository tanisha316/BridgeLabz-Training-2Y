import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int count=0;
        int org=number;
        
        while(org!=0){
             org=org/10;
             count++;
       
        }
        System.out.println("count= "+count);
}}
