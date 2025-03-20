import java.util.Scanner;

public class meanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;

        for (int i = 0; i < 11; i++) {
            height[i] = input.nextDouble();
            sum += height[i];
        }
        double mean = sum / height.length;
        System.out.printf("%.2f%n", mean);
        input.close();
    }

}
