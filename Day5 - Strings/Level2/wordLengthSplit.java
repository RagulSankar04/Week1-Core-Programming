import java.util.Scanner;

public class wordLengthSplit {
    @SuppressWarnings("unused")
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[] customSplit(String str) {
        int length = getStringLength(str);
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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Custom Split Output:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Output:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods producing the same result? " + compareArrays(customWords, builtInWords));
    }
}
