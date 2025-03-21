public class numberChecker4 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        if (sumOfDigits == number) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1, digit;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        if (sum == product) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        int number = 21;

        System.out.println(isPrime(number));
        System.out.println(isNeon(number));
        System.out.println(isSpy(number));
        System.out.println(isAutomorphic(number));
        System.out.println(isBuzzNumber(number));

    }
}
