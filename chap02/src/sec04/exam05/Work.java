package sec04.exam05;
import java.util.Scanner; 

public class Work {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		System.out.println ("------------------------------------");
		System.out.println ("1. List 2. Create 3.Delete 4.Quit");
		System.out.println ("------------------------------------");
		System.out.print("Select: ");
		
		int data = sc.nextInt();
		
		if (data==1) {
			System.out.println("Show List");
		} else if (data==2) {
			System.out.println("Creating");
		} else if (data==3) {
			System.out.println("Deleting");
		} else if (data==4) {
			System.out.println("Quit");
			sc.close();
			System.exit(0);
		} else System.out.println("You are only allowed to put 1~4");
		
	}
	
}

}
