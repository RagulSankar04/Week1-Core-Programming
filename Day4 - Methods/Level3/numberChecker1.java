import java.util.Arrays;

@SuppressWarnings("unused")

public class numberChecker1 {
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

    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(number, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return new int[] { largest, secondLargest };
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        int number = 153;

        System.out.println("The count of digits is: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Amstrong Number? " + isArmstrongNumber(number));

        int[] largestValues = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest: " + largestValues[0] + ", Second Largest: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest: " + smallestValues[0] + ", Second Smallest: " + smallestValues[1]);

    }
}
