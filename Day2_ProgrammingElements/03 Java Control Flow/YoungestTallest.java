import java.util.*;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ages");
        int ageamar=sc.nextInt();
        int ageakbar=sc.nextInt();
        int ageanthony=sc.nextInt();
        if(ageamar<ageanthony && ageamar<ageakbar){
            System.out.println("amar is youngest");
        }
        if(ageamar>ageanthony && ageanthony<ageakbar){
            System.out.println("anthony is youngest");
            }
             if(ageamar>ageakbar && ageanthony>ageakbar){
            System.out.println("akbar is youngest");
            }
            System.out.println("enter heights");
            double amarht=sc.nextDouble();
        double akbarht=sc.nextDouble();
        double anthonyht=sc.nextDouble();
        if(amarht>anthonyht && amarht>akbarht){
            System.out.println("amar is tallest");
        }
         if(amarht<anthonyht && anthonyht>akbarht){
            System.out.println("anthony is tallest");
        }
         if(akbarht>anthonyht && amarht<akbarht){
            System.out.println("akbar is tallest");
        }

    }
}

