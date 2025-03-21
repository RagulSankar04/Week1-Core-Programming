import java.util.Scanner;

public class practiceMatrix {
    private static void print2dArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void sumOfMatrices(int[][] first, int[][]second){
        int row = first.length;
        int col = first[0].length;
        int[][] sum = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        print2dArray(sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Rows in the matrix");
        int row = input.nextInt();
        System.out.println("Enter the Columns in the matrix");
        int col = input.nextInt();

        int[][] first = new int[row][col];
        int[][] second = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(String.format("Enter the first [%d] [%d] integer", i, j));
                first[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(String.format("Enter the second [%d] [%d] integer", i, j));
                second[i][j] = input.nextInt();
            }
        }

        System.out.println("First Matrix:\n");
        print2dArray(first);
        System.out.println("Second Matrix:\n");
        print2dArray(second);
        input.close();

        System.out.println("The sum of the Matrices are: \n");
        sumOfMatrices(first, second);

    }
}
