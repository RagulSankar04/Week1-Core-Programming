import java.util.Scanner;
class Trial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] student = new int[2];

		for(int i = 0; i< 2; i++){
			student[i] = input.nextInt();
		}
		
		for(int j = 0; j< 2; j++){
			System.out.print(student[j]);
		}
		input.close();
	}
}