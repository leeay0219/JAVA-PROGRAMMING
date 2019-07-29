package Star;
import java.util.Scanner; 
public class Star2_RightSort {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i=n; i>0; i--) {
			String str = " ";
			for (int j=0; j<=n; j++) {
				if (i>j) {
					str += " ";
				} else {
					str += "*";
				}
			}
			System.out.println(str); 
		}
		sc.close();
	}
}