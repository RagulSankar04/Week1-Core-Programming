import java.util.Scanner;

public class comparisonWindow {

    public static void generateException(String str, int start, int end) {
        System.out.println("Attempting substring from " + start + " to " + end);
        String substr = str.substring(start, end);
        System.out.println("Generated substring: " + substr);
    }

    public static void handleException(String str, int start, int end) {
        try {
            System.out.println("Attempting substring from " + start + " to " + end);
            String substr = str.substring(start, end);
            System.out.println("Generated substring: " + substr);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        int start = end + 1;

        try {
            generateException(str, start, end);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        handleException(str, start, end);

        input.close();
    }
}
