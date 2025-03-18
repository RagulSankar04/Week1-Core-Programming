import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner conv = new Scanner(System.in);
		float height = conv.nextFloat();
		float inch = height / 2.54f;
		float foot = inch / 12f;
		
		System.out.println("Your Height in cm is " + height + " while in feet is " + String.format("%.2f",foot) + " and inches is " + String.format("%.2f",inch));
		
	}
}