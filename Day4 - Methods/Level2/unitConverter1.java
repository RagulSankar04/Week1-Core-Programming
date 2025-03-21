public class unitConverter1 {
    public static double convertKmToMiles(double km) {
        double km2Miles = 0.621371;
        return km * km2Miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        System.out.println("10Km to Miles: " + convertKmToMiles(10));
        System.out.println("10Miles to Km: " + convertMilesToKm(10));
        System.out.println("10Meters to Feet: " + convertMetersToFeet(10));
        System.out.println("10Feet to Meters: " + convertFeetToMeters(10));
    }
}
