package Algorithm.BJ;
import java.util.*;
import java.io.*; 
public class Main40 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); 
		String bomb = br.readLine();
		
		Stack <Character> st = new Stack<>(); 
		
		for (int i=input.length()-1; i>=0; i--) {
			boolean isBomb = false; 
			char ch = input.charAt(i);
			st.push(ch);
			
			if (ch == bomb.charAt(0) && st.size() >= bomb.length()) {
				isBomb = true; 
				for (int j=0; j<bomb.length(); j++) {
					if (bomb.charAt(j) != st.get(st.size()-1-j)) {
						isBomb = false; 
						break;
					}
				}
				if (isBomb) {
					for (int k=0; k<bomb.length(); k++) {
						st.pop();
					}
				}
			}
		}
		
		StringBuffer sb = new StringBuffer(); 
		if (st.isEmpty()) System.out.println("FRULA"); 
		else  {
			for (int i=st.size()-1; i>=0; i--) {
				sb.append(st.pop());
			}
		}
		System.out.println(sb);
	}

}
