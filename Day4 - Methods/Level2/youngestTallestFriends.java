import java.util.Scanner;

public class youngestTallestFriends {

    public static String findYoungest(int[] ages, String[] friends) {
        int youngestAge = Math.min(Math.min(ages[0], ages[1]), ages[2]);
        for (int i = 0; i < 3; i++) {
            if (ages[i] == youngestAge) {
                return friends[i];
            }
        }
        return null;
    }

    public static String findTallest(double[] heights, String[] friends) {
        double tallestHeight = Math.max(Math.max(heights[0], heights[1]), heights[2]);
        for (int i = 0; i < 3; i++) {
            if (heights[i] == tallestHeight) {
                return friends[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] friends = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        String youngest = findYoungest(ages, friends);
        String tallest = findTallest(heights, friends);

        System.out.println(youngest + " is the youngest.");
        System.out.println(tallest + " is the tallest.");

        input.close();
    }
}
