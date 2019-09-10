package Algorithm.BJ;
import java.util.*; 

public class Main66 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			int[] a = new int[n+1]; 
			long plus = 0; 
			int max = 0; 
			
			for (int j=0; j<n; j++) {
				a[j] = sc.nextInt();
			}
			
			for (int j=n-1; j>-1; j--) { 
				if (a[j] > max) { 
					max = a[j]; 
				} else {
					plus += (max - a[j]); // 팔았을때 이득 더해줌
				}
			}
			System.out.println(plus); 
		}
		sc.close();
	}
}
