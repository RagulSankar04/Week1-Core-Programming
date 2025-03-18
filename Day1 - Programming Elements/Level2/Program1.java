import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		float num1 = calc.nextInt();
		float num2 = calc.nextInt();
		
		float division = num1 / num2;
		float remainder = num1 % num2;
		
		
		System.out.println("The Quotient is " + division + " and Remainder is " + remainder + " of the two number " + num1 + " and " + num2);
	}
}