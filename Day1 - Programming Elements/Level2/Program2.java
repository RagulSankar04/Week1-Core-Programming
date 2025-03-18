import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		int a = calc.nextint();
		int b = calc.nextint();
		int c = calc.nextint();
		
		int op1 = a + b * c;
		int op2 = a * b + c;
		int op3 = c + a / b;
		int op4 = a % b + c;
		
		System.out.println("The Results of int Operations are " + op1 + ", " + op2 + ", " + op3 + " and " + op4 );
	}
}