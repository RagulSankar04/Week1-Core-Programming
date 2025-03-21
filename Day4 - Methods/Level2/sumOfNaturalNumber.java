import java.util.Scanner;

public class sumOfNaturalNumber {
    public static int recursiveSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + recursiveSum(number - 1);
    }

    public static int formulaSum(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number");
            input.close();
            return;
        }

        int sumRec = recursiveSum(number);
        int sumForm = formulaSum(number);

        System.out.println("Sum using Recursion: " + sumRec);
        System.out.println("Sum using Formula: " + sumForm);

        if (sumRec == sumForm) {
            System.out.println("The outputs are Same");
        } else {
            System.out.println("The outputs aren't the same");
        }
        input.close();
    }
}
