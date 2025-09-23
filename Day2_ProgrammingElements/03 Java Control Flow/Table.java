import java.util.*;
public class Table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number between 6 to 9");
        int number=sc.nextInt();
        int table;
        for(int i=1;i<=10;i++){
            table=number*i;   
        
        System.out.println(number+"*"+i+"="+table);
    }
}}