import java.util.Scanner;

public class smallLetters {
    public static String toSmallLetters(String str) {
        StringBuilder lowerCaseText = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
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
        String str = input.nextLine();

        String smallUserDefined = toSmallLetters(str);
        String smallBuiltIn = str.toLowerCase();
        boolean isBothSame = compareStrings(smallBuiltIn, smallUserDefined);

        System.out.println("Original Text: " + str);
        System.out.println("User Defined Conversion: " + smallUserDefined);
        System.out.println("Built - in Conversion: " + smallBuiltIn);
        System.out.println("Is Both the Converion Same? " + isBothSame);

        input.close();
    }
}
