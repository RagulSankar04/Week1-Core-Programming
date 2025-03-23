import java.util.Scanner;

public class lengthOfString {
    public static int lengthUserDefined(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int UserDefined = lengthUserDefined(str);
        int BuiltIn = str.length();

        System.out.println("The UserDefined Lenght is: " + UserDefined + "\n");
        System.out.println("The BuiltIn Lenght is: " + BuiltIn + "\n");

        input.close();
    }
}