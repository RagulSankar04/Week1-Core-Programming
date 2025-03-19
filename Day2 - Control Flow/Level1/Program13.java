import java.util.Scanner;
class program13{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sumWhile = 0;
		
		if(num >=0){
			for (int i = 0; i <= num; i++){
				sumWhile += i;
			}
		}
		else{
			System.out.println("Enter a Valid Natural Number");
		}
		
		double formulasum = num * (num + 1) / 2;
		
		boolean isCorrect = (sumWhile == formulasum);
		
		System.out.println(sumWhile);
		System.out.println(formulasum);
		System.out.println(isCorrect);
		

	}
}
