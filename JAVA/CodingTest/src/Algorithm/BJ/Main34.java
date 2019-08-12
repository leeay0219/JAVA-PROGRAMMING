package Algorithm.BJ;
import java.util.*; 

public class Main34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int answer = n;
		
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			boolean check[] = new boolean[26];
			for (int j=1; j<s.length(); j++) {
				if (s.charAt(j-1) != s.charAt(j)) {
					if (check[s.charAt(j)-97]==true) {
						answer--;
						break;
					} 
					check[s.charAt(j-1)-97] = true;
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}

}
