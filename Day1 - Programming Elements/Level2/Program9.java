import java.util.Scanner;
public class Level2_1{
	public static void main(String[] args){
		Scanner park = new Scanner(System.in);
		
		double side1 = park.nextDouble();
		double side2 = park.nextDouble();
		double side3 = park.nextDouble();
		
		double perimeter = side1 + side2 + side3;
		double totalDistance = 5000;
		double rounds = totalDistance / perimeter;
		
		System.out.println("The total number of rounds the athlete will run is " + String.format("%.2f",rounds) + " to complete 5km");
	}
}