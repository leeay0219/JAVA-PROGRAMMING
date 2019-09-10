package Algorithm.BJ;

import java.util.*; 
public class Main68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		double [] n = new double[10]; 
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			n[s.charAt(i) - '0']++;
		}
		
		n[6] = (int)Math.ceil((n[6] + (double)n[9]/2));
		n[9] = 0; 
		
		for (double num : n) {
			if (num > count) {
				count = (int) num; 
			}
		}
		System.out.println(count);
		sc.close();
	}

}
