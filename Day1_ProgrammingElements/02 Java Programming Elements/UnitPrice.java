import java.util.Scanner;
public class UnitPrice {
    public static void main(String[] args) {
        System.out.print("enter unit price ");
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();

        System.out.print("enter quantity ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        }
    }

