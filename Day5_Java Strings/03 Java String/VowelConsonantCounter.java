import java.util.Scanner;

public class VowelConsonantCounter {
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
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] counts = countVowelsAndConsonants(text);

    
        System.out.println("\nTotal Vowels: " + counts[0]);
        System.out.println("Total Consonants: " + counts[1]);

        sc.close();
    }
}
