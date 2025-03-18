import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner interest = new Scanner(System.in);
		int principal = interest.nextInt();
		int rate = interest.nextInt();
		int time = interest.nextInt();
		
		int simpleInterest = (principal * rate * time)/100;
		System.out.println("The Simple Interest is " + simpleInterest + " for principal " + principal + ", Rate of Interest " + rate + " and time is " + time);
	}
}