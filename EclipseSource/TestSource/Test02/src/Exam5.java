
import java.util.*; 
public class Exam5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());

			Stack<String> st = new Stack<>();  
			
			for(int i=0; i<n; i++) {
				String s = sc.nextLine(); // string인자로 받기 
				if (s.equals("0")) {
					st.pop(); //방금들어온애가 0이면 스택에 저장되어있던 애 뺌 
				} else {
					st.push(s); //아니면 넣음
				}
			}
			
			int sum = 0; 
			int size = st.size();
			
			for (int i=0; i<size; i++) {
				sum += Integer.parseInt(st.pop());
			}
			
			System.out.println(sum);
			
			sc.close();
	}
}

