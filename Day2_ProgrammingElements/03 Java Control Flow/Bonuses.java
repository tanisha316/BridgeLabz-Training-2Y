import java.util.*;
public class Bonuses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary");
        int salary=sc.nextInt();
        System.out.println("enter years of service");
        int yearofsv=sc.nextInt();
        double bonus=0.05*salary;

        if(yearofsv>5){
         System.out.println("Bonus= "+bonus);
    }
}
}

