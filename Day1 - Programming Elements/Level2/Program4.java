import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		double celsius = calc.nextDouble();
		double fahrenheitResult = (celsius * 9/5) + 32;
		
		System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit" );
	}
}