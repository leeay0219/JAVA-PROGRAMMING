package chap04.sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 93;
		if (score>90) {
			System.out.println("Your score is over 90");
		} else if (score>=80) {
			System.out.println("Your score is less then 90 but over 80");
		} else {
			System.out.println("Your score is less then 80");
		}
	}

}
