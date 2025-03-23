import java.util.Scanner;

public class frequencyOfCharacters {
    public static int[][] findFrequencyOfCharacters(String text) {
        int[] freq = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        input.close();

        int[][] frequencyOfCharacters = findFrequencyOfCharacters(str);

        System.out.println("Character Frequencies: ");
        for (int[] entry : frequencyOfCharacters) {
            System.out.println((char) entry[0] + ": " + entry[1]);
        }
    }
}
