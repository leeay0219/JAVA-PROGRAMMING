package Review.Day1;
import java.util.Scanner; 

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); 
		for (int i=1; i<=n; i++) {
			for (int j=n; j>0; j--) {
				if(j>i) {
					System.out.print(" ");
				} else 
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
