import java.util.Scanner;
class CountDigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int variableCount = 0;
		while(number != 0){
			number /= 10;
			variableCount+=1;
		}
		System.out.println(variableCount);
	}
}