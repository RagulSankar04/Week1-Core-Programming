import java.util.Scanner;

public class uniqueCharacters {
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (str.charAt(count) != '\0') {
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }

    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueCharacters = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueCharacters[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharacters[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        char[] results = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            results[i] = uniqueCharacters[i];
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        char[] uniqueChars = findUniqueCharacters(str);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
