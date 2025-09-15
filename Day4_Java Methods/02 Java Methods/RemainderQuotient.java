import java.util.Scanner;

public class RemainderQuotient {    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (dividend): ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Remainder: " + result[0]);
            System.out.println("Quotient: " + result[1]);
        }

        sc.close();
    }
}
