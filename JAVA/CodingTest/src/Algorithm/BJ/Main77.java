package Algorithm.BJ;
import java.util.*;

public class Main77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		char[]ch = s.toCharArray(); 
		int[] a = new int [n];
		double r = 0;
		Stack <Double> st = new Stack<>();
		
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.nextLine()); 
		}
		
		for (int i=0; i<ch.length; i++) {
			if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
				double aa = st.peek();
				st.pop();
				double bb = st.peek(); // 두 수씩 연산하기 위해 임시 double형 변수 2개 만듦 
				st.pop();
				switch (ch[i]) {
				case '+':
					r = bb + aa; 
					break;
				case '-':
					r = bb - aa;
					break; 
				case '*':
					r = bb * aa; 
					break; 
				case '/':
					r = bb / aa; 
					break;
				}
				st.push(r);
			} else {
				st.push((double)a[ch[i] - 'A']); //대응하는 알파벳에 해당하는 숫자 스택에 넣어줌 (형변환) 
			}
		}
		
		System.out.printf("%.2f", st.pop());
		sc.close();
	}

}
