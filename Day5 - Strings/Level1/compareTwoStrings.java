import java.util.Scanner;

public class compareTwoStrings {
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
        String str1 = input.next();
        String str2 = input.next();

        boolean isSame = compareStrings(str1, str2);
        System.out.println(isSame);

        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        if (isSame == isEqual) {
            System.out.println("Both the method results are same");
        }

        input.close();

    }
}