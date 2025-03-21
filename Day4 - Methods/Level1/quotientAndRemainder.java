import java.util.Scanner;

public class quotientAndRemainder {
    public static int[] quotientRemainder(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divisor = input.nextInt();

        int[] result = quotientRemainder(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        input.close();
    }
}
