import java.util.Scanner;

public class MarksCalculator2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        int[][] marks = new int[number][3];
        int[] percentage = new int[number];
        String[] grade = new String[number];
        String[] remarks = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0)
                    subject = "Physics";
                else if (j == 1)
                    subject = "Chemistry";
                else if (j == 2)
                    subject = "Maths";

                System.out.print("Enter " + subject + " marks: ");
                marks[i][j] = input.nextInt();
                while (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("Invalid input. Enter marks between 0 and 100.");
                    System.out.print("Enter " + subject + " marks: ");
                    marks[i][j] = input.nextInt();
                }
            }

            double avg = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            percentage[i] = (int) avg;

            if (avg >= 80) {
                grade[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (avg >= 70) {
                grade[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (avg >= 60) {
                grade[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (avg >= 50) {
                grade[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (avg >= 40) {
                grade[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        System.out.println("\nResults:");
        System.out.println("--------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | %  | Grade | Remarks");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%7d | %7d | %8d | %5d | %2d%% | %s | %s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i], remarks[i]);
        }

        input.close();
    }
}
