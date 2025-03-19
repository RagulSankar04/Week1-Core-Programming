import java.util.Scanner;
class program8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int i = 1;
		if(number > 0){
			while(i <= number){
				if(number % i == 0){
					System.out.println(i);
				}
				i++;
			}
		}
	}
}