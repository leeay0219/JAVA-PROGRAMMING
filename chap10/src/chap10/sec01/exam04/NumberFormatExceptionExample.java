package chap10.sec01.exam04;
import java.util.*;
public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("cost: ");
			try {
				int price = Integer.parseInt(sc.nextLine());
				System.out.println("fine. " + price);
				break;
			} catch (Exception e) {
				System.out.println("wake up. input can only be number"); 
			}
		}
		sc.close(); 
	}

}
