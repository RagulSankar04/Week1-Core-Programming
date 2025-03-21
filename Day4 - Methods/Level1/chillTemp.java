import java.util.Scanner;

public class chillTemp {
    public static double calculateWindChill(double temp, double windSpeed) {
        double windchill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        return windchill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp = input.nextDouble();
        double windSpeed = input.nextDouble();

        double result = calculateWindChill(temp, windSpeed);

        System.out.println("The Wind Chill Temperature is: " + result);

        input.close();
    }
}
