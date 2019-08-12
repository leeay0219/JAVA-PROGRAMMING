package Test;
import java.util.*; 

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine()); 
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			int[] a = new int [n]; 
			int sum = 0; 
		
			for (int j=0; j<n; j++) {
				a[j] = sc.nextInt(); 
			}
			sc.nextLine(); 
			
			String f = new String();
			String s = new String(); 
			
			f = sc.nextLine();
			s = sc.nextLine();
			
			for (int j=0; j<n; j++) {
				if ((f.charAt(j) == 'O') && (s.charAt(j) == 'O')) {
					sum += a[j]; 
				}
			}
			
			System.out.print("Case #" + (i+1) + "\n"); 
			System.out.println(sum);
		}
		
		sc.close();
	}

}
