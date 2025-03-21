import java.util.Random;

public class matrix {
    public static int[][][] generateRandomMatrix(int row, int col) {
        Random rand = new Random();
        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                firstMatrix[i][j] = rand.nextInt(9);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                secondMatrix[i][j] = rand.nextInt(9);
            }
        }
        System.out.println("First Matrix: \n" + "\t");
        print2dArray(firstMatrix);
        System.out.println("Second Matrix: \n" + "\t");
        print2dArray(secondMatrix);
        System.out.println("\t");
        return new int[][][] { firstMatrix, secondMatrix };
    }

    public static void sumOfMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int row = firstMatrix.length;
        int col = firstMatrix[0].length;
        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("The sum of first and second matrix is: \n");
        print2dArray(sum);
    }

    public static void differenceOfMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int row = firstMatrix.length;
        int col = firstMatrix[0].length;
        int[][] difference = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                difference[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        System.out.println("The Difference of first and second matrix is: \n");
        print2dArray(difference);
    }

    public static void productOfMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int row = firstMatrix.length;
        int col = firstMatrix[0].length;
        int[][] product1 = new int[row][col];
        int[][] product2 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                product1[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
                product2[i][j] = firstMatrix[j][i] * secondMatrix[j][i];
            }
        }
        System.out.println("The Product of first and second matrix is: \n");
        print2dArray(product1);
        System.out.println("The Product of second and first matrix is: \n");
        print2dArray(product2);
    }

    public static void transposeOfMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int row = firstMatrix.length;
        int col = firstMatrix[0].length;
        int[][] transpose1 = new int[row][col];
        int[][] transpose2 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose1[j][i] = firstMatrix[i][j];
                transpose2[j][i] = secondMatrix[j][i];
            }
        }
        System.out.println("The Transpose of first matrix is: \n");
        print2dArray(transpose1);
        System.out.println("The Transpose of second matrix is: \n");
        print2dArray(transpose2);
    }

    public static int determinantOf2x2(int[][] firstMatrix) {
        if (firstMatrix.length != 2 || firstMatrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        return (firstMatrix[0][0] * firstMatrix[1][1]) - (firstMatrix[0][1] * firstMatrix[1][0]);

    }

    public static int determinantOf3x3(int[][] secondMatrix) {
        if (secondMatrix.length != 3 || secondMatrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        return (secondMatrix[0][0] * (secondMatrix[1][1] * secondMatrix[2][2] - secondMatrix[1][2] * secondMatrix[2][1])
                - secondMatrix[0][1]
                        * (secondMatrix[1][0] * secondMatrix[2][2] - secondMatrix[1][2] * secondMatrix[2][0])
                + secondMatrix[0][2]
                        * (secondMatrix[1][0] * secondMatrix[2][1] - secondMatrix[1][1] * secondMatrix[2][0]));
    }

    public static void main(String[] args) {
        int row = 3, col = 3;
        int[][][] matrices = generateRandomMatrix(row, col);
        int[][] firstMatrix = matrices[0];
        int[][] secondMatrix = matrices[1];
        sumOfMatrices(firstMatrix, secondMatrix);
        differenceOfMatrices(firstMatrix, secondMatrix);
        productOfMatrices(firstMatrix, secondMatrix);
        transposeOfMatrices(firstMatrix, secondMatrix);
        // System.out.println("The determinant of a 2x2 matrix is: " +
        // determinantOf2x2(firstMatrix));
        System.out.println("The determinant of a 3x3 matrix is: " + determinantOf3x3(secondMatrix));
    }

    public static void print2dArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
