package Algorithm.BJ;
import java.util.*;

public class Main62 {
	public static boolean contains(int[] a, int visit, int k) {
		for (int i = 0; i < k; i++) {
			if (a[i] == visit) { 
				return true;
			}
		}
		return false;
	}
	
	public static void dfs(int[] a, int i, int n) {
		if (i == a.length) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		} else {
			for (int j = 1; j <= n; j++) {
				if (!contains(a, j, i)) {
					a[i] = j;
					dfs(a, i+1, n);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //1-n까지
		int m = sc.nextInt(); //중복없이 m개
		int[] a = new int[m]; //m개 크기의 a 배열 만들어서 dfs문 돌리기
	
		dfs(a, 0, n);
		sc.close();
	}

}