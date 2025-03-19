import java.util.Scanner;
class PercentagGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int physics = input.nextInt();
		int chemistry = input.nextInt();
		int maths = input.nextInt();
		int average = (physics + chemistry + maths) / 3;
		
		String grade, remarks;
		if(average >= 80){
			grade = "A";
			remarks = "Level 4, above agency-normalized standards";
		}
		else if(average >= 70 && average <= 79){
			grade = "B";
			remarks = "Level 3, at agency-normalized standards";
		}
		else if(average >=60 && average <= 69){
			grade = "C";
			remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
		System.out.println(average);
		System.out.println(grade);
		System.out.println(remarks);
	}
}