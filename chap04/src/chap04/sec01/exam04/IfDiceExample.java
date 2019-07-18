package chap04.sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		int dice = (int)(Math.random()*6) + 1; 
		System.out.println(dice);
		
		if (dice%2 == 0) {
			System.out.println(dice + ": 짝수눈이 나왔습니다");
		} else 
			System.out.println(dice + ": 홀수 눈이 나왔습니다");
	}

}
