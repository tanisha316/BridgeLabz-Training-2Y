import java.util.Scanner;
public class CharFrequencyNestedLoops {
    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray();  
        int[] freq = new int[chars.length]; 
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; 
            freq[i] = 1; 
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') uniqueCount++;
        }
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] frequencies = findFrequencies(text);
        System.out.println("\nCharacter Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        sc.close();
    }
}
