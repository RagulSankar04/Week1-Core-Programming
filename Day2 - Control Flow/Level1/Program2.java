import java.util.Scanner;
class program2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		String out = "";
		
		if((num1 < num2) && (num1 < num3)){
			out = "Yes";
		}
		
		System.out.println(out);
	}
}