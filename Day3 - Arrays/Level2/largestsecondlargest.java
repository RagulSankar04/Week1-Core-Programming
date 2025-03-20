import java.util.Scanner;

public class largestsecondlargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = digits[0];
        int secondLargest = -1;

        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest == -1 ? "No second largest" : secondLargest);
        input.close();
    }
}
