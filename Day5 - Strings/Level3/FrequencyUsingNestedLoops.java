import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] freq = new int[characters.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        freq[i]++; // Increase frequency for duplicate character
                        characters[j] = '0'; // Mark duplicate character as '0'
                    }
                }
                result.append(characters[i]).append(": ").append(freq[i]).append("\n");
            }
        }
        return result.toString().split("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        input.close();

        String[] frequencyOfCharacters = findCharacterFrequency(str);

        System.out.println("Character Frequencies: ");
        for (String entry : frequencyOfCharacters) {
            System.out.println(entry);
        }
    }
}