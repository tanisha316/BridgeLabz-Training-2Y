import java.util.Scanner;
public class CharFrequency {
    public static int getLength(String text) {
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
    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256]; 
        int length = getLength(text);
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);  
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; 
            }
        }
        return result;
    }
    public static void displayFrequency(String[][] freqArr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < freqArr.length; i++) {
            System.out.println("    " + freqArr[i][0] + "      |     " + freqArr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = getCharFrequency(text);

        displayFrequency(result);

        sc.close();
    }
}
