package sec04.exam05;
import java.util.Scanner;

public class ScannerFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("count:");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.print("content: ");
		String con = sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println(con);
		}
		sc.close();
	}

}

