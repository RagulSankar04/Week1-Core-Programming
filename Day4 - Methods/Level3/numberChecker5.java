public class numberChecker5 {
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

    public static int greatestFactor(int[] factors) {
        int maxFactor = factors[0];
        for (int factor : factors) {
            if (factor > maxFactor) {
                maxFactor = factor;
            }
        }
        return maxFactor;
    }

    public static int sumOfFactors(int[] factors) {
        int sumOfFactors = 0;
        for (int factor : factors) {
            sumOfFactors += factor;
        }
        return sumOfFactors;
    }

    public static int productOfFactors(int[] factors) {
        int productOfFactors = 1;
        for (int factor : factors) {
            productOfFactors *= factor;
        }
        return productOfFactors;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product = Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 2; i < number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 28;

        int[] factors = findFactors(number);
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.println(factor + " ");
        }

        System.out.println("The Maximum of the factors is: " + greatestFactor(factors));
        System.out.println("The Sum of the factors is: " + sumOfFactors(factors));
        System.out.println("The Product of the factors is: " + productOfFactors(factors));
        System.out.println("The Product of the Cube of the Factors is: " + productOfCubeOfFactors(factors));
        // System.out.println("Is the given a Perfect Number? " +
        // isPerfectNumber(number));
        // System.out.println("Is the given a Abundant Number? " +
        // isAbundantNumber(number));
        // System.out.println("Is the given a Deficient Number? " +
        // isDeficientNumber(number));
        // System.out.println("Is the given a Strong Number? " +
        // isStrongNumber(number));
        System.out.println(number + " is " + (isPerfectNumber(number) ? "a Perfect Number." : "NOT a Perfect Number."));
        System.out.println(
                number + " is " + (isAbundantNumber(number) ? "an Abundant Number." : "NOT an Abundant Number."));
        System.out.println(
                number + " is " + (isDeficientNumber(number) ? "a Deficient Number." : "NOT a Deficient Number."));
        System.out.println(number + " is " + (isStrongNumber(number) ? "a Strong Number." : "NOT a Strong Number."));

    }
}
