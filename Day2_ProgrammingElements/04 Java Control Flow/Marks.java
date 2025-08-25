import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int phy=sc.nextInt();
        int chem=sc.nextInt();
        int maths=sc.nextInt();
        int avg=(phy+chem+maths)/3;
        System.out.println("average="+avg);
        if(avg>=80){
            System.out.println("Level 4, above agency-normalized standards");
        }
        else if(avg>=70 || avg<79){
            System.out.println("level 3,at agency-normalized standards");
        }
        else if(avg>=60 || avg<69){
            System.out.println("level 2,below,but approaching agency-normalized standards");
        }
        else if(avg>=50 || avg<59){
            System.out.println("level 1,well below agency-normalized standards");
        }
        else if(avg>=40 || avg<49){
            System.out.println("level 3,too below agency-normalized standards");
        }
        else if(avg<39){
            System.out.println("remedial standards");
        }
        }
    }
