import java.util.Scanner;
public class Compare {
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
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        boolean customCompare = compareStrings(lowerStr1, lowerStr2);
        boolean builtInCompare = lowerStr1.equals(lowerStr2);      
        System.out.println("\nComparison using charAt(): " + customCompare);
        System.out.println("Comparison using equals(): " + builtInCompare);

        if (customCompare == builtInCompare) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
        sc.close();
    }
}