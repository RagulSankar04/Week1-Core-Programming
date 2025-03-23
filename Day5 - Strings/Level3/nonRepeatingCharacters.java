import java.util.Scanner;

public class nonRepeatingCharacters {
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < length; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        input.close();

        char firstNonRepeating = findFirstNonRepeatingChar(str);
        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: " + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character found.");
        }
    }
}
