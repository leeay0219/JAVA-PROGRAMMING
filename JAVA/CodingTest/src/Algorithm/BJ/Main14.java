package Algorithm.BJ;
import java.util.Scanner;
public class Main14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int a = 0; 
		int b = 1;
		int c = 1; 
		
		for (int i=2; i<=n; i++) {
			c = a + b; 
			a = b; 
			b = c; 
		}
		
		System.out.print(c);
		
		sc.close();
	}

}
