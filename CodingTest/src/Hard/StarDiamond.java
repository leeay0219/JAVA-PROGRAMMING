package Hard;
import java.util.Scanner; 
public class StarDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //odd number
		int m = n/2;
		
		for (int i = -m; i<=m; i++) {
			int k = 0; 
			for (int j = 0; j < n-Math.abs(i); j++) {
				String result = k < Math.abs(i) ? " " : "*";
				System.out.print(result);
				k++;
			}
			System.out.println(); 
		}
	}

}
