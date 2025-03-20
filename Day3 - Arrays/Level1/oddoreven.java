import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sizeOfArray = number / 2 + 1;
        int[] odd = new int[sizeOfArray];
        int[] even = new int[sizeOfArray];
        int oddIndex = 0;
        int evenIndex = 0;

        if (number <= 0) {
            System.out.println("Enter a Natural Number");
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("Odd Numbers ");
        for(int i = 0; i < oddIndex; i++){
            System.out.println(odd[i]);
        }

        System.out.println();

        System.out.println("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++){
            System.out.println(even[i]);
        }
        input.close();
    }

}
