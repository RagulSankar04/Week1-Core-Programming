import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner weight = new Scanner(System.in);
		double kilograms = weight.nextDouble();
		double pounds = kilograms * 2.2;
		
		System.out.println("The weight of the person in pound is " + pounds + " and in Kg is " + kilograms);
	}
}