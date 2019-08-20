package Algorithm.BJ;
import java.util.*; 
public class Main37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];
		for (int i=0; i<n; i++) {
			s[i] = sc.nextLine();
		}
		
		int k = Integer.parseInt(sc.nextLine());
		if (k==1) { 
			for (int i=0; i<n; i++) {
				System.out.println(s[i]);
			}
		} else if (k==2) {
			for (int i=0; i<n; i++) {
				for (int j=n-1; j>=0; j--) {
					System.out.print(s[i].charAt(j));
				}
				System.out.println(); 
			}
		} else if (k==3) {
			for(int i=n-1; i>=0; i--) {
				for (int j=0; j<n; j++) {
					System.out.print(s[i].charAt(j));
				}
				System.out.println(); 
			}
		}
		
		sc.close(); 
	}

}
