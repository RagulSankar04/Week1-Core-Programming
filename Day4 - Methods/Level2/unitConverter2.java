public class unitConverter2 {
    public static double yards2feet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double feet2yards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double meter2inches(double meter) {
        double meter2inches = 39.3701;
        return meter * meter2inches;
    }

    public static double inches2meter(double inches) {
        double inches2meter = 0.0254;
        return inches * inches2meter;
    }

    public static double inches2cm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        System.out.println("10yards to feet is: " + yards2feet(10));
        System.out.println("10feet to yard is: " + feet2yards(10));
        System.out.println("10meters to inches is: " + meter2inches(10));
        System.out.println("10inches to meter is: " + inches2meter(10));
        System.out.println("10inches to cm is: " + inches2cm(10));
    }
}
