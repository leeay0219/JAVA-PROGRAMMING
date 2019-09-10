package Algorithm.BJ;
import java.util.*;
public class Main73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] ch = sc.next().toCharArray();
		for (int i=1; i<n; i++) {
			String s = sc.next();
			for (int j=0; j<ch.length; j++) {
				if (ch[j] != s.charAt(j)) {
					ch[j] = '?';
				}
			}
		}
		for (int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
