import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        
        long temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        
        int[] digits = new int[count];

        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (number % 10);
            number /= 10;
        }

        
        int[] reverseArray = new int[count];
        for (int i = 0; i < count; i++) {
            reverseArray[i] = digits[count - 1 - i];
        }

        System.out.print("\nReversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i]);
        }

        sc.close();
    }
}
