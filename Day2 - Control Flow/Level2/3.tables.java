import java.util.Scanner;
class program3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 6; i <= 9; i++){
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
