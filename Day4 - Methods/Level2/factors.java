import java.util.Scanner;

public class factors {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;

    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumOfSquare = 0;
        for (int factor : factors) {
            sumOfSquare += Math.pow(factor, 2);
        }
        return sumOfSquare;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] factorsResult = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factorsResult) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sum = sumOfFactors(factorsResult);
        long product = productOfFactors(factorsResult);
        int sumOfSquares = sumOfSquaresOfFactors(factorsResult);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        input.close();
    }
}