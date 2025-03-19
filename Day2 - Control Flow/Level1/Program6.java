import java.util.Scanner;
class Program6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num > 0){
			System.out.println("Positive");
		}
		else if(num < 0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}