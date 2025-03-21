public class unitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 37.78;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 10;
        double liters = 37.85;

        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " Pounds is " + convertPoundsToKilograms(pounds) + " Kilograms.");
        System.out.println(kilograms + " Kilograms is " + convertKilogramsToPounds(kilograms) + " Pounds.");
        System.out.println(gallons + " Gallons is " + convertGallonsToLiters(gallons) + " Liters.");
        System.out.println(liters + " Liters is " + convertLitersToGallons(liters) + " Gallons.");
    }
}
