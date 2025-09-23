import java.util.*;
public class Volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        int r=sc.nextInt();
         System.out.println("enter height");
        int h=sc.nextInt();
        double volume = 3.14 * r * r * h;
    System.out.println("volume of cylinder is "+volume);
    }
    
}
