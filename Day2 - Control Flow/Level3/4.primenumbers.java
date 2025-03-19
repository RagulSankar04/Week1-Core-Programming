import java.util.Scanner;
class PrimeNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean isPrime = true;
		
		if(number > 1){
			for(int i = 2; i <= number - 1; i++){
				if(number % i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(number + " is a Prime Number ");
			}
			else{
				System.out.println(number + " is Not a Prime Number");
			}
		}
		// else{
			// System.out.println("Enter value greater than 1");
		// }
	}
}
