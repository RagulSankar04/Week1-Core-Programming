import java.util.Scanner;
public class positiveornegative {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];

        for(int i = 0; i < 5; i++){
            number[i] = input.nextInt();
        }
        for(int j = 0; j < 5; j++){
            if(number[j] > 0){
                System.out.println("Positive");
            }
            else if(number[j] < 0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
        int length = number.length;
        if(number[0] < number[length-1]){
            System.out.println("less");
        }
        else if(number[0] > number[length-1]){
            System.out.println("greater");
        }
        else{
            System.out.println("Equal");
        }
        input.close();
    }
}
