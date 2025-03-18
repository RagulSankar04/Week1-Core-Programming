import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		double side = calc.nextDouble();
		double perimeter = side * 4;
		
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		
	}
}