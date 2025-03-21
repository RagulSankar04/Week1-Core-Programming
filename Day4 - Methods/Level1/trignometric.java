import java.util.Scanner;

public class trignometric {
    public static double[] calcTrignometric(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle = input.nextDouble();

        double[] result = calcTrignometric(angle);

        System.out.printf("Sine: %.4f%n", result[0]);
        System.out.printf("Cosine: %.4f%n", result[1]);
        System.out.printf("Tangent: %.4f%n", result[2]);
        input.close();
    }
}
