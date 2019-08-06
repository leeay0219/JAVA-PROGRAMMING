package sec04.exam01;
import java.util.Scanner; 

public class homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. name:");
		String name = sc.nextLine();
		System.out.println("2. birthday:");
		String birthday = sc.nextLine();
		System.out.println("3. phone:");
		String phone = sc.nextLine();
		
		System.out.println("[Personal Contact]");
		System.out.println("1. name: " + name);
		System.out.println("2. birthday: " + birthday);
		System.out.println("3. phone: " + phone);
		
		sc.close();
	}

	
}
