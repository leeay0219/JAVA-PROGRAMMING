package sec02.exam10;

public class AssignmentOperationExample {

	public static void main(String[] args) {
		int score = 93; 
		String grade = (score>90)? "A Grader" : (score>80)? "B Grader" : "C Grader"; 
		System.out.println(grade);
	}

}
