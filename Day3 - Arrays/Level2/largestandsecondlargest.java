import java.util.Scanner;

public class largestandsecondlargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int number = input.nextInt();

        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);

        input.close();
    }
}
