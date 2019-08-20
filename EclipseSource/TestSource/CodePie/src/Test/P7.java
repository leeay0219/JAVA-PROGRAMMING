package Test;
import java.util.*;
public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		Stack <Integer> st = new Stack<>();
		
		for(int i=0; i<t; i++) {
			int sum = 0;
			String s = sc.nextLine();
			int r = 0;
			int stair = 1;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j) == '(') {
					r += stair;
					st.push(r);
					sum += r;
				} else if(s.charAt(j) == ')') {
					r -= stair;
					sum += st.peek();
					st.pop();
				} else if(s.charAt(j) == '#') {
					if(j == s.lastIndexOf(s.charAt(j))){
						r /= 2;
						stair /= 2;
					} else {
						r *= 2;
						stair *= 2;
					}
				}
			}
			System.out.println("Case #" + (i + 1));
			System.out.println(sum);
			st.clear();
		}
		sc.close();
	}
}
