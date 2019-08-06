package Algorithm.BJ;
import java.util.Scanner; 

public class Main21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		String result = "" + (a*b*c); 
		String[] s = result.split("");
		int[] count = new int [10]; 
		
		for (int i = 0; i < s.length; i++) {
			for (int j=0; j<=9; j++) {
				if (Integer.parseInt(s[i]) == j) {
					count[j]++;
				}
			}
		}
		
		for (int i=0; i<=9; i++) {
			System.out.println(count[i]);
		}
		
		sc.close();
	}
}