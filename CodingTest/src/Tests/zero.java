package Tests;
import java.util.*; 
public class zero {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());

			Stack<String> st = new Stack<>();  
			
			for(int i=0; i<n; i++) {
				String s = sc.nextLine();
				if (s.equals("0")) {
					st.pop();
				} else {
					st.push(s);
				}
			}
			int sum = 0; 
			int size = st.size();
			
			for (int i=0; i<size; i++) {
				sum += Integer.parseInt((String)st.pop());
			}
			
			System.out.println(sum);
			
			sc.close();
	}
}

