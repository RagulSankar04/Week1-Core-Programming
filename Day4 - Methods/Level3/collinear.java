import java.util.Scanner;

public class collinear {
    public static boolean isCollinear(int x1, int x2, int x3, int y1, int y2, int y3) {
        if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) {
            return false;
        }
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static double areaOfTriangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        int y3 = input.nextInt();

        boolean collinear = isCollinear(x1, x2, x3, y1, y2, y3);
        System.out.println("Are the points collinear using slope formula? " + collinear);

        double areaFormed = areaOfTriangle(x1, x2, x3, y1, y2, y3);
        if (areaFormed == 0) {
            System.out.println("The points are collinear using area of triangle formula.");
        } else {
            System.out.println("The Points are NOT collinear using area of traingle formula.");
        }
        input.close();
    }
}
