package Algorithm.BJ;
import java.util.*; 
public class Main36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack <Character> st = new Stack<>();
		int result = 0; 
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push('(');
			} else if (s.charAt(i) == ')') {
				if (s.charAt(i-1) == '(') {
					st.pop();
					result += st.size();
					System.out.println(result);
				} else {
					st.pop();
					result += 1;
					System.out.println(result);
				}
			}
		}
		sc.close();
	}

}
