import java.util.Scanner;

public class MarksCalculator {
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

            int physics = 0, chemistry = 0, maths = 0;

            System.out.print("Enter Physics marks: ");
            physics = input.nextInt();
            while (physics < 0 || physics > 100) {
                System.out.println("Invalid input. Enter marks between 0 and 100.");
                System.out.print("Enter Physics marks: ");
                physics = input.nextInt();
            }

            System.out.print("Enter Chemistry marks: ");
            chemistry = input.nextInt();
            while (chemistry < 0 || chemistry > 100) {
                System.out.println("Invalid input. Enter marks between 0 and 100.");
                System.out.print("Enter Chemistry marks: ");
                chemistry = input.nextInt();
            }

            System.out.print("Enter Maths marks: ");
            maths = input.nextInt();
            while (maths < 0 || maths > 100) {
                System.out.println("Invalid input. Enter marks between 0 and 100.");
                System.out.print("Enter Maths marks: ");
                maths = input.nextInt();
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            double avg = (physics + chemistry + maths) / 3.0;
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
