import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		Scanner calc = new Scanner(System.in);
		int unitprice = calc.nextInt();
		int quantity = calc.nextInt();
		int price = unitprice * quantity;
		
		System.out.println("The total purchase price is INR " + price + " if the quantity " + quantity + " and unit price is INR " + unitprice);
	}
}