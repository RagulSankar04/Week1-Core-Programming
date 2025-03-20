import java.util.Scanner;

public class youngestandtallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] age = new int[3];
        int[] height = new int[3];

        int youngest = 0;
        int tallest = 0;

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextInt();
        }
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
        }
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        System.out.println(names[youngest]);
        System.out.println(names[tallest]);
        input.close();
    }
}
