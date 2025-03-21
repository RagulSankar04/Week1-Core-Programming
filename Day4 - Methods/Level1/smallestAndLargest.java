public class smallestAndLargest {
    public static int[] findSmallAndLarge(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));

        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        int[] result = findSmallAndLarge(5, 10, 2);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}
