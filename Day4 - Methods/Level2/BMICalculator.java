import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        height = height / 100;
        return weight / (height * height);
    }

    public static String[] determineBMIStatus(double[] bmi) {
        String[] status = new String[bmi.length];
        for (int i = 0; i < bmi.length; i++) {
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];
        double[] bmi = new double[10];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();

            bmi[i] = calculateBMI(data[i][0], data[i][1]);
            data[i][2] = bmi[i];
        }

        status = determineBMIStatus(bmi);

        System.out.println("\nBMI and Status of Each Individual:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + data[i][0] + " kg, Height: " + data[i][1]
                    + " cm, BMI: " + data[i][2] + ", Status: " + status[i]);
        }

        input.close();
    }
}
