package BJ;
import java.util.Scanner;

public class Study_HS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student ID 1234567: Ah Yeong Lee");
		System.out.println("Enter a0?");
		int a0 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a1?");
		int a1 = Integer.parseInt(sc.nextLine());
		int a2 = 0;

		while(true) {
			System.out.println("Enter a non-negative n? ");
			int n = Integer.parseInt(sc.nextLine());
			if (n < 0) {
				System.out.println("=> [Failure] It's negative! Try again...");
			} else {
				for (int i=2; i<=n; i++) {
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
