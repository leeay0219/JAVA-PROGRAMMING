package Algorithm.BJ;
import java.util.*; 

public class Main20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Stack<Integer> st = new Stack<>();  
		
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(sc.nextLine());
			if (m == 0) {
				st.pop();
			} else {
				st.push(m);
			}
		}

		int sum = 0; 
		int size = st.size();
		
		for (int i=0; i<size; i++) {
			sum += st.pop();
		}
		System.out.println(sum);
		
		sc.close();
	}

}
