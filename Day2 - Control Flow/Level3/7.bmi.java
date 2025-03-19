import java.util.Scanner;
class BMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		height = height / 100;
		double BMI = weight / (height * height);
		String status = "";
		if(BMI <= 18.4){
			status = "Underweight";
		}
		else if(BMI >= 18.5 && BMI <=24.9){
			status = "Normal";
		}
		else if(BMI >= 25.0 && BMI <= 39.9){
			status = "Overweight";
		}
		else{
			status = "Obese";
		}
		System.out.println(status);
	}
}