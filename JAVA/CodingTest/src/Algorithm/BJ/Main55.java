package Algorithm.BJ;
import java.util.*; 
public class Main55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		   while(true) {
	            String s = sc.nextLine();
	            if(s.equals(".")) break;
	      
	            Stack<Character> st = new Stack<>();
	            
	            boolean b = true;
	            for(int i=0; i<s.length(); i++) {
	                if(st.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == ']')) {
	                    b = false;
	                    break;
	                }
	                if (s.charAt(i) == '(') 
	                	st.push('(');
	                if (s.charAt(i) == ')') {
	                    if(st.peek() == '(') 
	                    	st.pop();
	                    else st.push(')');
	                }
	                if (s.charAt(i) == '[') 
	                	st.push('[');
	                if (s.charAt(i) == ']') {
	                    if(st.peek() == '[') 
	                    	st.pop();
	                    else 
	                    	st.push(']');
	                }
	            }
	            
	            if (st.isEmpty() && b) {
	            	System.out.println("yes");
	            } else {
	            	System.out.println("no");
	            }
	       }
		   sc.close();
	}
}