import java.util.Random;
import java.util.Scanner;

public class marks {

    public static int[][] generateMarks(int numberOfStudents) {
        Random rand = new Random();
        int[][] marks = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = 10 + rand.nextInt(91);
            marks[i][1] = 10 + rand.nextInt(91);
            marks[i][2] = 10 + rand.nextInt(91);
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int numberOfStudents = marks.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double averageMarks = totalMarks / 3.0;
            double percentage = (totalMarks / 300.0) * 100;

            results[i][0] = totalMarks;
            results[i][1] = Math.round(averageMarks * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        int numberOfStudents = results.length;
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" + (int) results[i][0] + "\t" +
                    results[i][1] + "\t" + results[i][2] + "%\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] marks = generateMarks(numberOfStudents);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrades(results);

        displayScorecard(marks, results, grades);

        input.close();
    }
}
