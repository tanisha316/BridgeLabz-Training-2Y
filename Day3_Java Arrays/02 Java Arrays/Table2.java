import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       int[] Result = new int[4]; 
        for (int i = 6; i <= 9; i++) {
            Result[i - 6] = number * i;
        }
        System.out.println(number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + Result[i - 6]);
        }
    }
}

