import java.util.Scanner;

public class LargeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) { // if array is full, break
                break;
            }
            digits[index] = (int) (number % 10);
            number = number / 10;
            index++;
        }

        
        int largest = -1;
        int secondLargest = -1;

        
        for (int i = 0; i < index; i++) {
            int digit = digits[i];

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        
        System.out.println("\n--- Result ---");
        if (largest != -1) {
            System.out.println("Largest digit: " + largest);
        }
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (number has repeated digits or single digit).");
        }

        sc.close();
    }
}
