import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter other number: ");
        float number2 = input.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        }
    }


