import java.util.Scanner;

public class shortestAndLongest {
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

    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] pair : wordLengthArray) {
            int length = Integer.parseInt(pair[1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = pair[0];
            }
            if (length > longestLength) {
                longestLength = length;
                longestWord = pair[0];
            }
        }
        return new String[] { shortestWord, longestWord };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();
        input.close();

        String[] words = customSplit(str);
        String[][] wordLengthArray = getWordLengthArray(words);
        String[] result = findShortestAndLongest(wordLengthArray);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}