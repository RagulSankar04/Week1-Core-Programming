import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		double distanceInFeet = calc.nextDouble();
		double distanceInYard = distanceInFeet / 3;
		double distanceInMile = distanceInYard / 1760;
		
		System.out.println("Your Height in Foot is " + distanceInFeet + " while in Yard is " + distanceInYard + " and miles is " + distanceInMile );
	}
}