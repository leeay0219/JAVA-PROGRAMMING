package Algorithm.BJ;
import java.util.*; 
public class Main70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine()); 
		String[] a = new String[n];
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextLine();
			int score = 0; 
			int sum = 0; 
			for (int j=0; j<a[i].length(); j++) {
				if (a[i].charAt(j) == 'O') {
					score++; 
					sum += score; 
				} else { 
					score = 0; 
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
