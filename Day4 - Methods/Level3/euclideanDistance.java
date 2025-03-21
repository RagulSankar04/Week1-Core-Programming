import java.util.*;

public class euclideanDistance {
    public static double getDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] equationOfLine(int x1, int x2, int y1, int y2) {
        if (x1 == x2) {
            System.out.println("The line is vertical, Slope is undefined");
        }

        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, x2 and y1, y2:");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();

        double distance = getDistance(x1, x2, y1, y2);
        System.out.println("The Euclidean Distance is: " + distance);

        double[] lineEquation = equationOfLine(x1, x2, y1, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + " x + " + lineEquation[1]);

        input.close();
    }
}
