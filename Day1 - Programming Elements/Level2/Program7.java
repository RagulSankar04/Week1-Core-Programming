import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		int num1 = calc.nextInt();
		int num2 = calc.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The Swapped Numbers are " + num1 + " and " + num2);
	}
}