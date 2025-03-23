import java.util.Scanner;

public class countOfVowelsAndConsonants {
    public static String checkCharacterType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelandConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = checkCharacterType(str.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("consonant")) {
                consonants++;
            }
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        input.close();

        int[] result = countVowelandConsonants(str);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

    }
}
