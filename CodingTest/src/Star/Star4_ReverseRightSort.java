package Star;
import java.util.Scanner;

public class Star4_ReverseRightSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int j = 0; 
		for (int i=1; i<=n; i++) {
			for (j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (j=0; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	}

}
