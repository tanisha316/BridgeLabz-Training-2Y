import java.util.Scanner;

public class ArrayCompare {
    public static char[] customToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();
        boolean isEqual = compareCharArrays(customArray, builtInArray);
        System.out.println("\nCustom char array: ");
        printCharArray(customArray);

        System.out.println("Built-in toCharArray(): ");
        printCharArray(builtInArray);

        System.out.println("Comparison result: " + isEqual);

        sc.close();
    }
}
