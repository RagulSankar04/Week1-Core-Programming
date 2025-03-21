import java.util.Scanner;

public class positiveornegatice {
    public static int numberCheck(int number){
        if(number > 0){
            return 1;
        }
        else if(number < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int positiveOrNegative = numberCheck(number);
        
        if (positiveOrNegative == 1) {
            System.out.println("The number is Positive.");
        } else if (positiveOrNegative == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
        input.close();

    }
}
