import java.util.Scanner;
class program11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int counter = number;
		
		if(number > 0 && number < 100){
			while(counter < 100){
				System.out.println(counter);
				counter += number;
			}
		}
	}
}
