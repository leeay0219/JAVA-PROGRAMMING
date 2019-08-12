package Algorithm.BJ;
import java.util.*; 

public class Main30 {

	public static void main(String[] args) throws EmptyStackException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Stack<String> st = new Stack<>();
		
		for (int i = 0; i < n; i++) {        
	         String[] a = sc.nextLine().split("");
	   
	         for (int j = 0; j < a.length; j++) {
	            if (a[j].equals("(")) {
	               st.push(a[j]);
	            } else {
	               if (st.contains("("))
	                  st.pop();
	               else {
	                  st.push(a[j]);
	               }
	            }
	         }
	         
	         if (st.isEmpty()) {
	            System.out.println("YES");
	         } else {
	            System.out.println("NO");
	         }
	         st.clear();
	      }
		sc.close();
	}
}

