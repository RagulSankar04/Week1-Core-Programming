import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		double fahrenheit = calc.nextDouble();
		double celsiusResult = (fahrenheit - 32) * 5/9;
		
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius" );
	}
}