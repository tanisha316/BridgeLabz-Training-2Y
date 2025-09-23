import java.util.Scanner;

public class SubstringCompare {
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSub = customSubstring(text, start, end);
        String builtInSub = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSub = text.substring(start, end);
        } else {
            System.out.println("⚠️ Invalid indices for built-in substring. Skipping built-in extraction.");
        }
        boolean isEqual = compareStrings(customSub, builtInSub);
        System.out.println("\nCustom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Comparison result: " + isEqual);

        sc.close();
    }
}
