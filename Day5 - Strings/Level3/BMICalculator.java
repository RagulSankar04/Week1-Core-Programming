import java.util.Scanner;

public class BMICalculator {
    public static String[][] bodyMassIndex(int[][] details) {
        String[][] results = new String[10][2];
        for (int i = 0; i < 10; i++) {
            double weight = details[i][0];
            double heightInMetres = details[i][1] / 100.0;
            double bmi = weight / Math.pow(heightInMetres, 2);

            results[i][0] = String.format("%.2f", bmi);
            results[i][1] = getBMIStatus(bmi);
        }
        return results;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.9)
            return "Normal weight";
        else if (bmi >= 25 && bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] details = new int[10][2];

        System.out.println("Enter the weights: ");
        for (int i = 0; i < 10; i++) {
            details[i][0] = input.nextInt();
        }

        System.out.println("Enter the Heights: ");
        for (int i = 0; i < 10; i++) {
            details[i][1] = input.nextInt();
        }

        String[][] BMI = bodyMassIndex(details);

        System.out.println("\nBMI Results:");
        System.out.println("Person\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + BMI[i][0] + "\t" + BMI[i][1]);
        }

        input.close();
    }
}
