import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input >=1 && input <=10000) {
				if (input < x) {
				System.out.print (input + " ");
				} 
			} else break; 

		}
		sc.close(); 
  }
}