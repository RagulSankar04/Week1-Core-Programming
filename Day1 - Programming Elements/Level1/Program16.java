import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		int numberOfStudents = calc.nextInt();
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		System.out.println("The Total Number of Students are " + numberOfStudents + " and the total handshake are " + handshakes );
	}
}