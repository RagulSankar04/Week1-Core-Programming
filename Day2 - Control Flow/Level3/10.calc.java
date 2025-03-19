import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double first = input.nextDouble();
		double second = input.nextDouble();
		String op = input.next();
        double result = 0.0;
        
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        
        System.out.println(result);
	}
}