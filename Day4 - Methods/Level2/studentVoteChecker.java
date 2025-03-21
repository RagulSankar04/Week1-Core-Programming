import java.util.Scanner;

public class studentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        studentVoteChecker checker = new studentVoteChecker();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = input.nextInt();
            boolean canVote = checker.canStudentVote(age[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}
