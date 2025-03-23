import java.util.Scanner;

public class characterType {
    public static String checkCharacterType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowels";
            } else {
                return "Consonants";
            }
        }
        return "Not a Letter";

    }

    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacterType(str.charAt(i));
        }
        return result;
    }

    public static void displayCharacterTable(String[][] table) {
        System.out.println("Character | Type");
        System.out.println("-----------------");
        for (String[] row : table) {
            System.out.printf("  %s      |    %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        input.close();

        String[][] characterTable = classifyCharacters(str);
        displayCharacterTable(characterTable);
    }

}
