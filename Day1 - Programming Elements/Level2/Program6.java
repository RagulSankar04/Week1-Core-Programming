import java.util.Scanner;
public class Level2{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		int salary = calc.nextInt();
		int bonus = calc.nextInt();
		int totalIncome = salary + bonus;
		
		System.out.println("The Salary is INR " + totalIncome + " and bonus is INR  " + bonus + ". Hence Total Income is INR " + totalIncome );
		
	}
}