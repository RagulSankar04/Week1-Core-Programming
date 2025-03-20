import java.util.Scanner;

public class multi_to_1d_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Rows:");
        int rows = input.nextInt();
        System.out.println("Enter the Columns:");
        int cols = input.nextInt();

        System.out.println();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("The elements in 1D array is: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
