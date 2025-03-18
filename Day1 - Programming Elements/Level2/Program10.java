import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner choc = new Scanner(System.in);
		int numberOfchocolates  = choc.nextInt();
		int numberOfChildren = choc.nextInt();
		
		int noOfEach = numberOfchocolates / numberOfChildren;
		int noOfRemaining = numberOfchocolates % numberOfChildren;
		
		System.out.println("The number of chocolates each child gets is " + noOfEach + " and the number of remaining chocolates are " + noOfRemaining);
	}
}