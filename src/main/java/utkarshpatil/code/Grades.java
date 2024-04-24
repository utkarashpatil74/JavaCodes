package utkarshpatil.code;

public class Grades {
	
	
	public static void grades(int marks) {
		
		if(marks>=0 && marks<=100)
		{
		
		if(marks>=91 && marks<=100) {
			System.out.println("Grade is AA "+ "and marks are "+marks);
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("Grade is AB "+ "and marks are "+marks);
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("Grade is BB "+ "and marks are "+marks);
		}
		else if(marks>=61 && marks<=70) {
			System.out.println("Grade is BC "+ "and marks are "+marks);
		}
		else if(marks>=51 && marks<=60) {
			System.out.println("Grade is CD "+ "and marks are "+marks);
		}
		else if(marks>=41 && marks<=50) {
			System.out.println("Grade is DD "+ "and marks are "+marks);
		}
		else {
			System.out.println("He is failed!!!!!");
		}
		
		}
		else {
			System.out.println("Enter valid marks!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grades.grades(70);

	}

}
