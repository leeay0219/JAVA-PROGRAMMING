package Review.Day1;
import java.util.Scanner; 

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i=1; i<=n; i++) {
			for (int k=n-1; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
