package Algorithm.BJ;
import java.util.*; 
public class Main31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Stack <Character>st = new Stack<>();
		int answer = 0; 
		
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			st.clear();
			  for (int j = 0; j < s.length(); j++) {
	                if (!st.isEmpty() && s.charAt(j) == st.peek()) {
	                    st.pop(); 
	                } else {
	                    st.push(s.charAt(j));
	                } 
	          }
	            if (st.size() == 0) {
	                answer++;
	            } 
	            st.clear();
		}
		
		System.out.println(answer);
		sc.close();
	}

}
