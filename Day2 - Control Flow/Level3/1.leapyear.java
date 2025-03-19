import java.util.Scanner;
class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		if (year >= 1582) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("Leap Year");
					} 
					else {
						System.out.println("Not a Leap Year");
					}
				} 
				else {
					System.out.println("Leap Year");
				}
			} 
			else {
				System.out.println("Not a Leap Year");
			}
		} 
		else {
			System.out.println("only year after 1582");
		}
	}
}
