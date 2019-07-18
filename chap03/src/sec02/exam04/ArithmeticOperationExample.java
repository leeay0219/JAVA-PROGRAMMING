package sec02.exam04;
import java.util.Scanner; 

public class ArithmeticOperationExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.print("Put a number");
		int num = Integer.parseInt(sc.nextLine());
		
		if((num%2) == 0) {
			System.out.println("Even number");
		} else System.out.println("Odd number");
		} 
	}
}
