import java.util.Random;

public class footBallTeam {
    public static int sumOfAllElements(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }
        return sum;
    }

    public static int shortestOfAll(int[] height) {
        int shortest = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] < shortest) {
                shortest = height[i];
            }
        }
        return shortest;
    }

    public static int tallestOfAll(int[] height) {
        int tallest = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] height = new int[11];

        System.out.println("Randomly generated player heights:");
        for (int i = 0; i < height.length; i++) {
            height[i] = rand.nextInt(100) + 150;
            System.out.print(height[i] + " ");
        }
        System.out.println();

        int sum = sumOfAllElements(height);
        double mean = (double) sum / height.length;
        int shortest = shortestOfAll(height);
        int tallest = tallestOfAll(height);

        System.out.println("\nThe sum of all the heights is: " + sum);
        System.out.println("The mean height of players is: " + String.format("%.2f", mean));
        System.out.println("The shortest player height is: " + shortest);
        System.out.println("The tallest player height is: " + tallest);
    }

}
