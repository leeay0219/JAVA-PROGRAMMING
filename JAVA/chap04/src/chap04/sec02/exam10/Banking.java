package chap04.sec02.exam10;
import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
		boolean run = true; 
		int balance = 0; 
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			
			int choice = Integer.parseInt(sc.nextLine());
				if (choice == 1)  {
					System.out.println("예금액>>");
					int input = Integer.parseInt(sc.nextLine());
					balance += input; 
				}
			
				if (choice == 2) {
					System.out.println("출금액>>");
					int output = Integer.parseInt(sc.nextLine());
					balance -= output;
				}
			
				if (choice == 3) {
					System.out.println("잔고>>" + balance + "원");
				}
		
				if (choice == 4) {
					System.out.println("프로그램 종료");
					break;
				}
		}
		sc.close();
		
	}
}
