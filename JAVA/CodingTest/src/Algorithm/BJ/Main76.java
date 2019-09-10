package Algorithm.BJ;
import java.util.*; 
public class Main76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray(); 
		String r = "";
		Stack <Character> st = new Stack<>();
		
		for (int i=0; i<ch.length; i++) {
			switch(ch[i]) {
				case '(': { //오픈괄호는 바로 넣음
					st.push(ch[i]);
					break; 
				}
				case ')': {
					while(true) {
						if (st.peek() == '(') {
							st.pop();
							break;
						} else {
							r += st.pop(); // (가 나올때까지 결과 문자열에 추가
						}
					}
					break; 
				}
				case '+': 
				case '-': { // 우선순위 낮음
					while (!st.empty() && st.peek() != '(') {
						r += st.pop(); // '+'와 '-'보다 우선순위가 낮은 기호는 없으므로 스택이 비거나 스택의 top이 괄호의 시작인 '('이 나올 때까지 결과 문자열에 추가
					}
					st.push(ch[i]);
					break; 
				}
				case '/':
				case '*': {
					while (!st.empty() && (st.peek() == '/' || st.peek() == '*')) {
						r += st.pop(); // 스택이 비거나, 스택의 top이 우선순위가 낮은 기호가 나올 때까지 결과 문자열에 추가
					}
					st.push(ch[i]);
					break; 
				}
				default: { //알파벳은 문자열에 바로 추가
					r += ch[i]; 
				}
			}
		}
		
		while (!st.isEmpty()) {
			r += st.pop(); // 반복문 다 돌았는데 스택 안비었으면 남은 연산자들 문자열에 추가
		}
		
		System.out.println(r);
			
		sc.close();
	}

}
