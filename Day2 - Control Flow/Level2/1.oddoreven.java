import java.util.Scanner;
class program1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num >= 0){
			for(int i = 1; i <= num; i++){
				if(i % 2 == 0){
					System.out.println(i + " Even");
				}
				else if(i % 2 == 1){
					System.out.println(i + " Odd");
				}
				
			}
		}
		else{
			System.out.println("Enter a Natural Number");
		}
	}
}
