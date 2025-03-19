import java.util.Scanner;
class program3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		boolean isFirst = (num1 >= num2) && (num1 >= num3);
		boolean isSecond = (num2 >= num1) && (num2 >= num3);
		boolean isThird = (num3 >= num1) && (num3 >= num2);
		
		System.out.println("Is the first number the largest? " + isFirst);
		System.out.println("Is the second number the largest? " + isSecond);
		System.out.println("Is the third number the largest? " + isThird);
	}
}