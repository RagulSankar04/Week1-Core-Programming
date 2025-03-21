import java.util.Random;

public class ZaraBonusCalculator {
    public static int[][] determineSalaryAndService() {
        Random random = new Random();
        int[][] employeeData = new int[10][2];

        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = 1 + random.nextInt(20);
        }
        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedEmployeeData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            updatedEmployeeData[i][0] = oldSalary;
            updatedEmployeeData[i][1] = bonus;
            updatedEmployeeData[i][2] = newSalary;
        }
        return updatedEmployeeData;
    }

    public static void displayResults(double[][] updatedEmployeeData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee No | Old Salary | Bonus Amount | New Salary");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedEmployeeData[i][0];
            double bonus = updatedEmployeeData[i][1];
            double newSalary = updatedEmployeeData[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%12d | %10.2f | %12.2f | %10.2f\n", i + 1, oldSalary, bonus, newSalary);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total        | %.2f | %.2f | %.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = determineSalaryAndService();
        double[][] updatedEmployeeData = calculateBonusAndNewSalary(employeeData);
        displayResults(updatedEmployeeData);
    }
}
