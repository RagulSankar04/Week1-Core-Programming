import java.util.Scanner;

public class frequencyUsingUniqueChar {
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    public static String[][] findFrequencyOfCharacters(String text) {
        int[] freq = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        input.close();

        String[][] frequencyOfCharacters = findFrequencyOfCharacters(str);

        System.out.println("Character Frequencies: ");
        for (String[] entry : frequencyOfCharacters) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }
}
