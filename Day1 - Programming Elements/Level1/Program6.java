import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		int fees = 125000;
		int discountPercent = 10;
		
		int discount = fees / discountPercent;
		int discountamt = fees - discount; 
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountamt);
	}
}