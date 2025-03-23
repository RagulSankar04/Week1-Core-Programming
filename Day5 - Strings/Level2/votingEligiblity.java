import java.util.Random;
import java.util.Scanner;

public class votingEligiblity {
    public static int[] generateStudentAges(int no) {
        int[] ages = new int[no];
        Random rand = new Random();
        for (int i = 0; i < no; i++) {
            ages[i] = rand.nextInt(99);
        }
        return ages;
    }

    public static String[][] checkEligiblity(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void displayResults(String[][] table) {
        System.out.println("Age | Eligiblity");
        System.out.println("-----------------");
        for (String[] row : table) {
            System.out.printf("%s    | %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Students:");
        int noOfStudents = input.nextInt();
        input.close();

        int[] agesOfStudent = generateStudentAges(noOfStudents);
        String[][] eligiblityTable = checkEligiblity(agesOfStudent);
        displayResults(eligiblityTable);
    }
}
