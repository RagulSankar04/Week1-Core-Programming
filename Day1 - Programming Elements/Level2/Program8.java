import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner city = new Scanner(System.in);
		String name = city.nextLine();
		String fromCity = city.nextLine();
		String viaCity = city.nextLine();
		String toCity = city.nextLine();
		
		double fromToVia = city.nextDouble();
		double viaToFinalCity = city.nextDouble();
		
		int hours1 = city.nextInt();
		int mins1 = city.nextInt();
		
		int hours2 = city.nextInt();
		int mins2 = city.nextInt();
		
		double totalDistance = fromToVia + viaToFinalCity;
		int totalHours = hours1 + hours2;
		int totalMins = mins1 + mins2;
		
		totalHours += totalHours / 60;
		totalMins = totalMins % 60;
		 
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalHours + " hours " + totalMins + " minutes");
		
	}
}