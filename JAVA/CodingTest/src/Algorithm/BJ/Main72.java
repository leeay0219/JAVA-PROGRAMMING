package Algorithm.BJ;
import java.util.*;
public class Main72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt()*2;
		int c = sc.nextInt()*3;
		int[] arr = new int[101];
		int n = 0;
		int r = 0;
		for (int i=0; i<3; i++) {
			int s = sc.nextInt();
			int f = sc.nextInt();
			for (int j=s; j<f; j++) {
				++arr[j];
			}
			n = Math.max(f, n);
		}
		for (int i=1; i<=n; i++) {
			if (arr[i] == 1) {
				r += a; 
			} else if (arr[i] == 2) {
				r += b;
			} else if (arr[i] == 3) {
				r += c;
			}
		}
		System.out.println(r);
		sc.close();
	}

}
