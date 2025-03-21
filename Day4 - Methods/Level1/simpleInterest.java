import java.util.Scanner;

public class simpleInterest {
    public static double interestCalc(int principal, int rate, int time) {
        double simpleInterest = (principal * rate * time) / 100.0;
        return simpleInterest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();

        double simpInt = interestCalc(principal, rate, time);

        System.out.println("The Simple Interest is " + simpInt + " for the principal amount of " + principal
                + " and the Rate of Interest of " + rate + "% and Time " + time + " Years");
        input.close();

    }
}