package Algorithm.SWExpertAcademy;
import java.util.*; 
public class Stackk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=10; i++) {
			Stack <Character> s = new Stack<>();
			int n = Integer.parseInt(sc.nextLine());
			String input = sc.nextLine();
			boolean valid = true; 
			
			for (int j=1; j<=input.length(); j++) {
				char now = input.charAt(j);
				if (now == '{' || now == '(' || now == '<' || now == '[') {
	                    s.push(now);
	            } else {
	            	if (now == '}' && s.peek() == '{') {
                        s.pop();
                    } else if (now == ')' && s.peek() == '(') {
                        s.pop();
                    } else if (now == ']' && s.peek() == '[') {
                        s.pop();
                    } else if (now == '>' && s.peek() == '<') {
                        s.pop();
                    } else {
                        valid = false;
                        break;
                    }
	            }
			}
			
			if (s.isEmpty() && valid) 
				System.out.println("#" + (i) + " 1");
			else 
				System.out.println("#" + (i) + " 0");
		}
		sc.close();
	}
}
