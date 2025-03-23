import java.util.Scanner;

public class palindromeCheck {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArrayMethod(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        input.close();

        boolean isPalindrome1 = isPalindromeIterative(text);
        System.out.println("Palindrome check using Iterative Method: " + isPalindrome1);

        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check using Recursive Method: " + isPalindrome2);

        boolean isPalindrome3 = isPalindromeArrayMethod(text);
        System.out.println("Palindrome check using Character Arrays Method: " + isPalindrome3);
    }
}
