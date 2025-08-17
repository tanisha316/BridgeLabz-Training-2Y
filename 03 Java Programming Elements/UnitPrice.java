import java.util.*;
public class UnitPrice {
     public static void main(String[] args) {
        System.out.print("enter unit price ");
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();

        System.out.print("enter quantity ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        }
    }