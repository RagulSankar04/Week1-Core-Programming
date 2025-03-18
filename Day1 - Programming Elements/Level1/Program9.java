import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner amt = new Scanner(System.in);
		
		int fees = amt.nextInt();
		int discountPercent = amt.nextInt();
		
		int discount = fees / discountPercent;
		int discountamt = fees - disc; 
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountamtamt);
	}
}