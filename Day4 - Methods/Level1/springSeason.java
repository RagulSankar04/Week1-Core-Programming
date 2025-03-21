import java.util.Scanner;

public class springSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || 
               (month == 4) ||               
               (month == 5) ||               
               (month == 6 && day <= 20);    
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = input.nextInt(); 
        int day = input.nextInt();   

        System.out.println(isSpringSeason(month, day)); 

        input.close(); 
    }
}
