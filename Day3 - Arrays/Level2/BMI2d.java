import java.util.Scanner;

public class BMI2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberofPersons = input.nextInt();
        double[][] personalData = new double[numberofPersons][3];
        String[] Status = new String[numberofPersons];

        for (int i = 0; i < numberofPersons; i++) {
            double height, weight;

            System.out.print("Enter height (in meters): ");
            height = input.nextDouble();
            while (height <= 0) {
                System.out.println("Please enter a positive value for height.");
                System.out.print("Enter height (in meters): ");
                height = input.nextDouble();
            }

            System.out.print("Enter weight (in kilograms): ");
            weight = input.nextDouble();
            while (weight <= 0) {
                System.out.println("Please enter a positive value for weight.");
                System.out.print("Enter weight (in kilograms): ");
                weight = input.nextDouble();
            }

            double BMI = weight / (height * height);
            personalData[i][0] = height;
            personalData[i][1] = weight;
            personalData[i][2] = BMI;

            if (BMI < 18.5) {
                Status[i] = "Underweight";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                Status[i] = "Normal weight";
            } else if (BMI >= 25 && BMI <= 29.9) {
                Status[i] = "Overweight";
            } else {
                Status[i] = "Obesity";
            }
        }
        System.out.println("\nDetails of each person:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI     | Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < numberofPersons; i++) {
            System.out.printf("%6d | %.2f       | %.2f        | %.2f   | %s\n",
                    i + 1, personalData[i][0], personalData[i][1], personalData[i][2], Status[i]);
        }
        input.close();
    }

}
