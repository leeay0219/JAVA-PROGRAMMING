package Algorithm.BJ;
import java.util.*; 
public class Main41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];
		
		for (int i=0; i<n; i++) {
			s[i] = sc.nextLine();
		}
		
		int result1 = 0; 
		char result2 = '0';
		
		for (int i=0; i<n; i++) {
			String reverse = (new StringBuffer(s[i])).reverse().toString(); 
			for (int j=i; j<n; j++) {
				if (reverse.equals(s[j])) {
					result1 = reverse.length();
					result2 = reverse.charAt((reverse.length())/2);
					break; 
				}
				if (result2 != '0') break; 
			}
		}
		System.out.println(result1 + " " + result2);
		sc.close();
	}

}
