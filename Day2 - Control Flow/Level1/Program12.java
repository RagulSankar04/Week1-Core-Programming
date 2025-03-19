import java.util.Scanner;
class program12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sumWhile = 0;
		
		if(num >=0){
			int i = 1;
			while(i<=num){
				sumWhile += i;
				i++;
			}
		}
		double formulasum = num * (num + 1) / 2;
		
		boolean isCorrect = (sumWhile == formulasum);
		System.out.println(sumWhile);
		System.out.println(formulasum);
		System.out.println(isCorrect);
	}
}
