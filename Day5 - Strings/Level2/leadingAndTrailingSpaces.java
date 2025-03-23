import java.util.Scanner;

public class leadingAndTrailingSpaces {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    public static String customSubString(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareTwoString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        input.close();

        int[] indices = findTrimIndices(str);
        String trimUserDefined = customSubString(str, indices[0], indices[1]);
        String trimBuiltIn = str.trim();

        System.out.println("Custom Trimmed: " + trimUserDefined);
        System.out.println("BuiltIn Trimmed: " + trimBuiltIn);
        System.out.println("Is Both same? " + compareTwoString(trimUserDefined, trimBuiltIn));
    }
}
