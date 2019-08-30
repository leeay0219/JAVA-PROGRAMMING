package Algorithm.BJ;
import java.util.*;
public class Main53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String patt = sc.nextLine();
		String[] s = new String[n]; 
		
		for (int i=0; i<n; i++) {
			s[i] = sc.nextLine();
		}
		
		for (int i=0; i<n; i++) {
			String first = patt.split("\\*")[0];
			String second = patt.split("\\*")[1];
			if (s[i].startsWith(first)) {
				s[i] = s[i].substring(first.length(), s[i].length());
			} else {
				System.out.println("NE");
				continue; 
			}
			if (s[i].endsWith(second)) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		sc.close();
	}

}
