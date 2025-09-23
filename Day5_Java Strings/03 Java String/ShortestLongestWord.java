import java.util.Scanner;

public class ShortestLongestWord {
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
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }
        words[index] = text.substring(start, len);
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
    public static int[] findShortestAndLongest(String[][] wordTable) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            int shortestLen = Integer.parseInt(wordTable[shortestIndex][1]);
            int longestLen = Integer.parseInt(wordTable[longestIndex][1]);

            if (len < shortestLen) {
                shortestIndex = i;
            }
            if (len > longestLen) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] wordTable = wordsWithLength(words);
        int[] result = findShortestAndLongest(wordTable);
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordTable.length; i++) {
            System.out.println(wordTable[i][0] + "\t" + wordTable[i][1]);
        }
        System.out.println("\nShortest word: " + wordTable[result[0]][0] +
                " (Length: " + wordTable[result[0]][1] + ")");
        System.out.println("Longest word: " + wordTable[result[1]][0] +
                " (Length: " + wordTable[result[1]][1] + ")");

        sc.close();
    }
}
