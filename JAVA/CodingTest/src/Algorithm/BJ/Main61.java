package Algorithm.BJ;
import java.util.*; 
public class Main61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine(); 
		
		int rank [] = new int [10]; 
		Stack <Integer> st = new Stack<>();
		
		for (int i=0; i<r; i++) {
			StringBuffer sb = new StringBuffer(sc.nextLine().substring(1, c-1));
			sb.reverse(); 
			
			for (int j=0; j<c-2; j++) {
				if (sb.charAt(j) != '.') {
					rank[sb.charAt(j)-'0'] = j;
					if (!st.contains(j)) {
						st.add(j);
					}
					break; 
				}
			}
		}
		
		Collections.sort(st);
		for (int i=1; i<rank.length; i++) {
			System.out.println(st.indexOf(rank[i])+1);
		}
		sc.close();
	}

}
