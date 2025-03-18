import java.util.Scanner;

public class Level1{
	public static void main(String[] args){
		int pens = 14;
		int stud = 3;
		
		int perperson = pens % stud;
		int bal = pens / stud;
		
		System.out.println("The Pen Per Student is " + bal + " and the remaining pen not distributed is " + perperson);
	}
}