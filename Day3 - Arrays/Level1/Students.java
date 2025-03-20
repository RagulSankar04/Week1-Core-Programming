import java.util.Scanner;
public class Students {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] studentAge = new int[10];

        for(int i = 0; i<10; i++){
            studentAge[i] = input.nextInt();
        }
        for(int j = 0; j<studentAge.length; j++){
            if(studentAge[j] >= 18){
                System.out.println("The Student with the age " + studentAge[j] + " is eligible to vote");
            }
            else{
                System.out.println("The Student with the age " + studentAge[j] + " is not eligible to vote");
            }
        }
        input.close();
    }
}
