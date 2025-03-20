import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] BMI = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            weight[i] = input.nextInt();
            height[i] = input.nextInt() / 100.0;
            BMI[i] = weight[i] / (height[i] * height[i]);

            if (BMI[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (BMI[i] <= 24.9) {
                status[i] = "Normal";
            } else if (BMI[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("The height and weight of person " + (i + 1) + " is " + (height[i] * 100) + " cm and "
                    + weight[i] + " Kg. BMI: " + BMI[i] + ", Status: " + status[i]);
        }
        input.close();

    }
}
