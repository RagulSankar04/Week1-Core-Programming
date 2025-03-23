import java.util.Scanner;

public class stringToCharArray {
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean resultComparison(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] charArrayCustom = getCharacters(str);
        char[] charArrayBuiltIn = str.toCharArray();

        System.out.println("Characters using user-defined: " + new String(charArrayCustom));
        System.out.println("Characters using pre-defined: " + new String(charArrayBuiltIn));
        System.out.println(resultComparison(charArrayCustom, charArrayBuiltIn));

        input.close();

    }
}