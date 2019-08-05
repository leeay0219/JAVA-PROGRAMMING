
import java.util.*; 
public class Exam5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());

			Stack<String> st = new Stack<>();  
			
			for(int i=0; i<n; i++) {
				String s = sc.nextLine(); // string���ڷ� �ޱ� 
				if (s.equals("0")) {
					st.pop(); //��ݵ��¾ְ� 0�̸� ���ÿ� ����Ǿ��ִ� �� �� 
				} else {
					st.push(s); //�ƴϸ� ����
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

