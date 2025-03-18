import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();
		double mile = km / 1.6;
		System.out.println("The Total miles is " + mile + " miles for the given " + km + " km");
		
	}
}