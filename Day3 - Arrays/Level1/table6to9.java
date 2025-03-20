import java.util.Scanner;

public class table6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
            System.out.println(number + " * " + i + " = "+ multiplicationResult[i - 6]);

        }
        input.close();
    }
}