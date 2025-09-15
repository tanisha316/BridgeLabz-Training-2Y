import java.util.Scanner;
public class VowelConsonantType {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        else {
            return "Not a Letter";
        }
    }
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);      
            result[i][1] = checkCharType(ch);       
        }
        return result;
    }
    public static void display2DArray(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "\t\t" + data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] analysis = analyzeString(text);
        display2DArray(analysis);

        sc.close();
    }
}
