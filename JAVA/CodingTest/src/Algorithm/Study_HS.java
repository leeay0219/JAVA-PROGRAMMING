/*
	다음의 점화식을 계산하는 프로그램을 만드시오.
	
	an = (-1)^n ⋅an−1 + 3⋅an−2   (n≥2)   
	
	n, n-1, n-2 는 아래첨자임  
	
	* 절차
	 1) a0과 a1에 들어갈 두 정수 입력하기
	 2) n에 들어갈 정수 입력하기
	 3) 만약 입력된 정수가 0보다 작으면 2)의 과정을 반복하기
	 4) 0보다 크다면 an의 값을 출력한다.

	출력                                        입력
	a0을 입력하시오 -                           3
	a1을 입력하시오 -                           4
	음수가 아닌 n을 입력하시오 -                -2
	=> [실패] 음수입니다! 다시 입력하세요.
	   음수가 아닌 n을 입력하시오 -             4
	=> [성공] a4 = 38
	   

 */
package Algorithm;
import java.util.Scanner;

public class Study_HS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a0?");
		int a0 = Integer.parseInt(sc.nextLine()); // a0 입력
		System.out.println("Enter a1?");
		int a1 = Integer.parseInt(sc.nextLine()); // a1 입력
		int a2 = 0; // a2는 0으로 초기값 설정

		while(true) { //성공한 경우는 멈추고, n에 음수 입력하면 계속 진행하도록 while문 이용 
			System.out.println("Enter a non-negative n? ");
			int n = Integer.parseInt(sc.nextLine()); //n입력 
			if (n < 0) {
				System.out.println("=> [Failure] It's negative! Try again...");
			} else {
				for (int i=2; i<=n; i++) { //점화식 이용
					a2 = (int)(Math.pow(-1, i) * a1) + (3*a0);  
					a0 = a1; 
					a1 = a2;
				}
				System.out.println("=> [Success] a" + n + " = " + a2);
				break;
			}
		}
		
		sc.close(); 
	}

}
