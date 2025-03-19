import java.util.Scanner;
class program7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int day = input.nextInt();
		
		if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)){
			{
				System.out.println("It's a Spring Season");
			}
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}