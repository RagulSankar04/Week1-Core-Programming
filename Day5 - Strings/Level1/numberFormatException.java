import java.util.Scanner;

public class numberFormatException {
    public static void generateException(String str) {
        int number = Integer.parseInt(str);
        System.out.println("Converted Number: " + number);
    }

    public static void handleException(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid input! Please enter a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Caught Runtime Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String str = input.nextLine();

        try {
            generateException(str);
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception in Main" + e.getMessage());
        }

        handleException(str);

        input.close();
    }
}
