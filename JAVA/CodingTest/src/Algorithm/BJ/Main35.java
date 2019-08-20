package Algorithm.BJ;
import java.util.*;
public class Main35 {
	static int[] d; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int [n+1]; 
		System.out.println(dp(n));
		sc.close();
	}
	
	public static int dp(int x) {
		if (x==1) return 0; 
		if (d[x] > 0) return d[x];
		d[x] = dp(x-1) + 1; 
		
		if (x%2 == 0) {
			int tmp = dp(x/2) + 1; 
			if (d[x] > tmp) 
				d[x] = tmp;
		}
		
		if (x%3 == 0) {
			int tmp = dp(x/3) + 1; 
			if (d[x] > tmp) 
				d[x] = tmp; 
		}
		return d[x];
	}
 
}
