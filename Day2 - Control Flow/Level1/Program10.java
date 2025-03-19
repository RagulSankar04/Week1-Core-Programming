import java.util.Scanner;
class program10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		
		while (true){
			double userValue = input.nextDouble();
			if(userValue == 0){
				break;
			}
			total = total + userValue;
		}
		System.out.println(total);
	}
}