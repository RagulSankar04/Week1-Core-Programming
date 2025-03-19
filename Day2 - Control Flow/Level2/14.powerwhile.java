import java.util.Scanner;
class program11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int power = input.nextInt();
		int result = 1;
		int counter = 1;
		
		if(power >0){
			while(counter <= power){
				result *= number;
				counter++;
			}
		}
		System.out.println(result);
	}
}