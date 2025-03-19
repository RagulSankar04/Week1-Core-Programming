import java.util.Scanner;
class program2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double salary = input.nextInt();
		int service = input.nextInt();
		double bonus = 0.0;
		
		if(service > 5){
			bonus = salary * 0.05;
		}
		
		System.out.println(bonus);
	}
}
