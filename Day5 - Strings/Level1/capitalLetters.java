import java.util.Scanner;

public class capitalLetters {
    public static String toCapitalLetters(String str) {
        StringBuilder upperCaseText = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();

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

        String capitalUserDefined = toCapitalLetters(str);
        String capitalBuiltIn = str.toUpperCase();
        boolean isBothSame = compareStrings(capitalBuiltIn, capitalUserDefined);

        System.out.println("Original Text: " + str);
        System.out.println("User Defined Conversion " + capitalUserDefined);
        System.out.println("Built - in Conversion: " + capitalBuiltIn);
        System.out.println("Is Both the Converion Same? " + isBothSame);

        input.close();
    }
}
