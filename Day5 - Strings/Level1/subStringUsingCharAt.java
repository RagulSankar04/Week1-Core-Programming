import java.util.Scanner;

public class subStringUsingCharAt {
    public static String getSubStringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String subStringUsingCharAt, String subStringBuiltIn) {
        if (subStringUsingCharAt.length() != subStringBuiltIn.length()) {
            return false;
        }
        for (int i = 0; i < subStringUsingCharAt.length(); i++) {
            if (subStringUsingCharAt.charAt(i) != subStringBuiltIn.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        String subStringCharAt = getSubStringUsingCharAt(str, start, end);
        String subStringBuiltIn = str.substring(start, end);

        System.out.println("The subString using CharAt is: " + subStringCharAt);
        System.out.println("The subString using BuiltIn is: " + subStringBuiltIn);
        System.out.println(compareStrings(subStringCharAt, subStringBuiltIn));

        input.close();
    }
}
