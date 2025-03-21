import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static int sumOfnNaturalNumbers(int number) {
        int sum = (number * (number + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        double sumOfnnumbers = sumOfnNaturalNumbers(number);
        System.out.println("The Sum of " + number + " natural numbers is " + sumOfnnumbers);

        input.close();
    }
}
