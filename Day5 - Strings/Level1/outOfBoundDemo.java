import java.util.Scanner;

public class outOfBoundDemo {
    public static void generateException(String str) {
        System.out.println("The character at " + str.length() + " is: " + str.charAt(str.length()));
    }

    public static void handleException(String str) {
        try {
            System.out.println("The character at " + str.length() + " is: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        handleException(str);

        input.close();
    }
}
