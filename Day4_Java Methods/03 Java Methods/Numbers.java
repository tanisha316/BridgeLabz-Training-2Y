import java.util.Scanner;
public class Numbers {
    public static boolean isPositive(int num) {
        return num > 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nAnalysis of Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\nComparison of first and last element:");
        if (result == 1) {
            System.out.println(numbers[0] + " is Greater than " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is Equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is Less than " + numbers[numbers.length - 1]);
        }
    }
}

