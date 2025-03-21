import java.util.*;

@SuppressWarnings("unused")

public class numberChecker3 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int left = 0, right = digits.length - 1;
        while (left < right) {
            int temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;

            left++;
            right--;
        }
        return digits;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = getDigitsArray(number);
        reverseDigitsArray(reversedDigits);
        return areArraysEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static void main(String[] args) {
        int number = 1234;

        System.out.println("The count in digits is: " + countDigits(number));
        System.out.println("The Digits in Array are: " + Arrays.toString(getDigitsArray(number)));

        int[] digits = getDigitsArray(number);
        System.out.println("Digits in array: " + Arrays.toString(getDigitsArray(number)));

        int[] reversedArray = getDigitsArray(number);
        reverseDigitsArray(reversedArray);
        System.out.println("Reversed digits: " + Arrays.toString(reversedArray));
        System.out.println("Are arrays Equal? " + areArraysEqual(digits, reversedArray));
        System.out.println("Is the number a palindrome? " + isPalindrome(number));
        System.out.println("Is the number a Duck Number? " + isDuckNumber(number));

    }
}
