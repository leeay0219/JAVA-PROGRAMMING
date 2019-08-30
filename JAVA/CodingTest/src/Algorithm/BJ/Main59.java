package Algorithm.BJ;
import java.util.*; 
public class Main59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		String[] c = s.split("_");
		char[] big = new char[c.length-1];
		
		//c -> java
		if (s.contains("_")) {
			for (int i=1; i<c.length; i++) {
				big[i-1] = c[i].charAt(0);
			}
			
			for (int i=0; i<big.length; i++) {
				big[i] -= 32;
			}
			
			for (int i=1; i<c.length; i++) {
				c[i] = c[i].replaceFirst(c[i].charAt(0) + "", big[i-1] + "");
			}
			
			for (int i=0; i<c.length; i++) {
				System.out.print(c[i]); 
			}
		}
		
		
		
		//java -> c
		int count = 0;
		
		if (!s.contains("_")) {
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					count++;
				}
			}
			
			char[] lil = new char[count];
		}
		
		sc.close();
	}

}
