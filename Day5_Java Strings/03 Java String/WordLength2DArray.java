import java.util.Scanner;

public class WordLength2DArray {

    // Method to find string length without using length()
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // accessing character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop counting when out of bounds
        }
        return count;
    }

    // Method to split string into words without using split()
    public static String[] customSplit(String text) {
        int len = customLength(text);

        // Step 1: Count spaces to know number of words
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, len);
        return words;
    }
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; 
            result[i][1] = String.valueOf(customLength(words[i])); 
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);

        String[][] table = wordsWithLength(words);
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]); // convert back to int
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
