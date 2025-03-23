public class arrayOutOfBound {
    public static void generateException(String[] names) {
        System.out.println("The Last element is: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("The Last element is: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };

        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception in Main: " + e.getMessage());
        }
        handleException(names);
    }
}
