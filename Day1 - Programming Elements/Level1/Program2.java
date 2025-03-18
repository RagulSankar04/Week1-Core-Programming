import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner temp = new Scanner(System.in);
		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		
		int average = (maths + physics + chemistry) / 3;
		
		System.out.println("Sams average mark in PCM is " + average);
	}
}