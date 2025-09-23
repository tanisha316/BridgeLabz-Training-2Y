import java.util.Scanner;
public class CustomSplitDemo {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        
        }
        return count;
    }
    public static String[] customSplit(String text) {
        int len = customLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;
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
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean isEqual = compareArrays(customWords, builtInWords);
        System.out.println("\nCustom Split:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("\nComparison result: " + isEqual);

        sc.close();
    }
}
