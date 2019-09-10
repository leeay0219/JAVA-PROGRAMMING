package Algorithm.BJ;
import java.util.*; 
public class Main75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Stack <String> st = new Stack<>(); 
		
		for (int i=0; i<n; i++) {
			String s = sc.nextLine(); 
			String[] a = s.split(""); 
			int count = 0; 
			
			for (int j=0; j<a.length; j++) {
				if (a[j].equals("(")) {
					st.push(a[j]);
					count++; 
				} else {
					if (!st.isEmpty()) {
						if (a[j].equals(")") && st.peek().equals("(")) {
							st.pop();
							count--; 
						}
					} else 
						count++;
				}	
			} 
			
			if (count != 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			st.clear();
		}
		sc.close();
	}

}
