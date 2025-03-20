import java.util.Scanner;

public class oldandnewsalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                if (input.hasNextDouble()) {
                    salary[i] = input.nextDouble();
                    if (salary[i] >= 0)
                        break;
                } else {
                    input.next();
                }
                System.out.println("Invalid salary. Please enter a positive number.");
            }
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                if (input.hasNextDouble()) {
                    service[i] = input.nextDouble();
                    if (service[i] >= 0)
                        break;
                } else {
                    input.next();
                }
                System.out.println("Invalid years of service. Please enter a non-negative number.");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
            totalOldSalary += salary[i];
        }
        System.out.println(totalOldSalary);
        System.out.println(totalBonus);
        System.out.println(totalNewSalary);
        input.close();
    }
}
