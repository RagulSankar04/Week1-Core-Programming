import java.util.Arrays;

public class numberChecker2 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigitsOfArray(int[] number) {
        int sum = 0;
        for (int digit : number) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquareOfArray(int[] number) {
        int sumOfSquares = 0;
        for (int digit : number) {
            sumOfSquares += Math.pow(digit, 2.0);
        }
        return sumOfSquares;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if (number % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] frequencyOfDigits(int number) {
        int[] frequency = new int[10];
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            frequency[digit]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int number = 153;

        System.out.println("The count in digits is: " + countDigits(number));
        System.out.println("The Digits in Array are: " + Arrays.toString(getDigitsArray(number)));
        System.out.println("The Sum of digits in array are: " + sumOfDigitsOfArray(getDigitsArray(number)));
        System.out.println("The Sum of Squares of digits in array are: " + sumOfSquareOfArray(getDigitsArray(number)));
        System.out.println("Is this Harsad Number? " + isHarshadNumber(number));

        int[] freq = frequencyOfDigits(number);
        System.out.println("Frequency of digits in " + number + ":");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " times");
            }
        }
    }
}
