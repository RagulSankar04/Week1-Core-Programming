import java.util.Scanner;

public class handShakes {
    public static double calculateHandShakes(int number) {
        double noOfHandshakes = (number * (number - 1)) / 2;
        return noOfHandshakes;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        double handShakes = calculateHandShakes(number);
        System.out.println("The Total Number of Handshakes are " + handShakes);
        input.close();
    }
}