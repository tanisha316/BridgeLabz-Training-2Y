public class NumberChecker5 {

    // Method to calculate sum of proper divisors
    private static int sumOfDivisors(int number) {
        int sum = 1; // 1 is always a proper divisor (for numbers > 1)
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (number == 1) ? 0 : sum;
    }

    // Method to check if number is Perfect
    public static boolean isPerfect(int number) {
        return number > 0 && sumOfDivisors(number) == number;
    }

    // Method to check if number is Abundant
    public static boolean isAbundant(int number) {
        return number > 0 && sumOfDivisors(number) > number;
    }

    // Method to check if number is Deficient
    public static boolean isDeficient(int number) {
        return number > 0 && sumOfDivisors(number) < number;
    }

    // Method to calculate factorial of a number
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if number is Strong
    // Strong number: Sum of factorials of digits == number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 145; 

        System.out.println("Number: " + number);
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
