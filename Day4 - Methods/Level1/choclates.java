import java.util.Scanner;

public class choclates {
    public static int[] studentChoclates(int noOfChoclates, int noOfStudents) {
        int perStudent = noOfChoclates / noOfStudents;
        int remaining = noOfChoclates % noOfStudents;
        return new int[] { perStudent, remaining };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfChoclates = input.nextInt();
        int noOfStudents = input.nextInt();

        int[] result = studentChoclates(noOfChoclates, noOfStudents);
        System.out.println("Choclate per Student: " + result[0]);
        System.out.println("Choclate Remaining: " + result[1]);

        input.close();
    }
}
