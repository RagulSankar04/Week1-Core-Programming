import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] result = new int[10];

        for(int i = 1; i <= 10; i++){
            result[i-1] = number * i ;
        }
        for(int j = 1; j <= 10; j++){
            System.out.println(number + " * " + j + " = " + result[j-1]);
        }


        input.close();
    }
    
}
