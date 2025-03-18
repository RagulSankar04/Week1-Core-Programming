import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		double radius = 6378;
		double mile = 0.239913;
		double volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
		
		double mile3 = volume * mile;
		System.out.println("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + mile3);
	}
}