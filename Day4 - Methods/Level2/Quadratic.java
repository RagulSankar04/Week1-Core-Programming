import java.util.Scanner;

public class Quadratic {

    public static double[] calcRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            return new double[] { root };
        } else {
            return new double[] {};
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a, b, and c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double[] roots = calcRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Only one root: " + roots[0]);
        } else {
            System.out.println("No real roots.");
        }

        input.close();
    }
}
