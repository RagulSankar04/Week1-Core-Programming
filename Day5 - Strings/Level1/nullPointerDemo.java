public class nullPointerDemo {
    @SuppressWarnings("null")
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    @SuppressWarnings("null")
    public static void handleNullPointerException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointer Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception Caught in main: " + e.getMessage());
        }

        handleNullPointerException();
    }
}
