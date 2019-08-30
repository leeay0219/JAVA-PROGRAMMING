package Algorithm.BJ;
import java.util.*;
public class Main45 {
	static char[] minsk = {'a','b','k','d','e','g','h','i','l','m','n','1','o','p','r','s','t','u','w','y'};
	
	public static int convert (char ch) {
		int tmp = 0; 
		for (int i=0; i<minsk.length; i++) {
			if (ch == minsk[i]) 
				tmp = i; 
		}
		return tmp; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n]; 
		for (int i=0; i<n; i++) {
			s[i] = sc.nextLine();
			s[i] = s[i].replaceAll("ng", "1"); 
		}

		for (int i=0; i<n; i++) {
			String tmp = "";
			for (int j=0; j<s[i].length(); j++) {
				tmp += (char)(convert(s[i].charAt(j)) + 'a');
			}
			s[i] = tmp; 
		}
		
		Arrays.sort(s);
		for(int i=0;i<n;i++) {
			String tmp ="";
			for(int j=0;j<s[i].length();j++) {
				tmp += minsk[s[i].charAt(j) - 'a'];
			}
			System.out.println(tmp.replaceAll("1", "ng"));
		}

		sc.close();
	}

}
