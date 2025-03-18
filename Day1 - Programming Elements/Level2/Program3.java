import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		double a = calc.nextDouble();
		double b = calc.nextDouble();
		double c = calc.nextDouble();
		
		double op1 = a + b * c;
		double op2 = a * b + c;
		double op3 = c + a / b;
		double op4 = a % b + c;
		
		System.out.println("The Results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + " and " + op4 );
	}
}