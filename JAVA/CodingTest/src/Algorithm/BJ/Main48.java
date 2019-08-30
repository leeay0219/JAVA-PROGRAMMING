package Algorithm.BJ;
import java.util.*;
public class Main48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = new String[s.length()];
		
		for (int i=0; i<s.length(); i++) {
			a[i] = "";
			
			for (int j=i; j<s.length(); j++) {
				a[i] += s.charAt(j);
			}
		}
		
		Arrays.sort(a);
		
		for (int i=0; i<s.length(); i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
