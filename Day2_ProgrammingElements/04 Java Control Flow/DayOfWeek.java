import java.util.*;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("month= ");
        int m=sc.nextInt();
        System.out.print("date= ");
        int d=sc.nextInt();
        System.out.println("year= ");
        int y=sc.nextInt();
        int y0;int x;int m0;int d0;
        y0=y-(14-m)/12;
        x=y0+(y0/4)-(y0/100)+(y0/400);
        m0=m+12*((14-m)/12)-2;
        d0=(d+x+31*m0/12)%7;
       
        switch(m){
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("february");
            break;
            case 3:
            System.out.println("march");
            break;
            case 4:
            System.out.println("april");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("august");
            break;
            case 9:
            System.out.println("september");
            break;
            case 10:
            System.out.println("october");
            break;
            case 11:
            System.out.println("november");
            break;
            case 12:
            System.out.println("december");
            break;
        }
        switch(d0){
            
             case 0:
            System.out.println("sunday");
            break;

             case 1:
            System.out.println("monday");
            break;

             case 2:
            System.out.println("tuesday");
            break;

             case 3:
            System.out.println("wednesday");
            break;

             case 4:
            System.out.println("thursday");
            break;

             case 5:
            System.out.println("friday");
            break;
             case 6:
            System.out.println("saturday");
            break;
        }
        System.out.println(d0);

    }
}
