import java.util.Scanner;

public class triangularPark {
    public static double rounds(int side1, int side2, int side3, int distance) {
        int perimeter = side1 + side2 + side3;
        double rounds = (double) distance / perimeter;

        return rounds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        int distance = 5;

        double noOfRounds = rounds(side1, side2, side3, distance);

        System.out.println("The number of rounds the athelete has to complete is " + noOfRounds);

        input.close();
    }
}
