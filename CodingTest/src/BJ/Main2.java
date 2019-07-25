package BJ;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] m = new int[n];
		int max = m[0];
		int min = m[0];

		for(int i = 0;i < m.length; i++) {
			m[i] = sc.nextInt();
			if (i==0) {
				min = m[i];
				max = m[i];
			}
			if(max <= m[i]) {
			   max = m[i];
			}
						
			if(min >= m[i]) {
			   min = m[i];
			}
		}
		System.out.print(min + " " + max);
	
	}

}
