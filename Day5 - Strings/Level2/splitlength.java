import java.util.Scanner;

public class splitlength {
    @SuppressWarnings("unused")
    public static int stringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[] customSplit(String str) {
        int length = stringLength(str);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start);

        return words;
    }

    public static String[][] getWordLengthArray(String[] words) {
        int wordCount = words.length;
        String[][] wordLengthArray = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(stringLength(words[i]));
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();

        String[] splitUserDefined = customSplit(str);

        String[][] wordLengthArray = getWordLengthArray(splitUserDefined);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1])); // Convert String to Integer
        }

    }
}
