import java.util.*;
public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int m = 0;
				int n = sc.nextInt();
				int k = sc.nextInt(); 
				int[]a = new int[n+1]; 
				for (int i=1; i<=n; i++) {
					a[i] = sc.nextInt(); 
				}
				
				for (int i=n; i>0; i--) {
						m+= k/a[i]; 
						k %= a[i];
				}
				
				System.out.println(m);
				sc.close(); 
		}
}
