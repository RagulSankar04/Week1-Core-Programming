import java.util.Scanner;
class program1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		String out = "";
		if(num % 5 == 0){
			out = "Yes";
		}
		
		System.out.println("Is the number " + num + " divisible by 5 ? "+ out);
	}
}