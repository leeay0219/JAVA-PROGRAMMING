package Algorithm.BJ;
import java.util.*; 

public class Main51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n*2];
		Queue <String> q = new LinkedList<>(); 
		int count = 0;
		
		for (int i=0; i<n*2; i++) {
			s[i] = sc.nextLine();
			if (q.isEmpty() || !q.contains(s[i])) {
				q.offer(s[i]);
			} else if (!q.peek().equals(s[i]) && q.contains(s[i])) {
				q.remove(s[i]);
				count++;
			} else if (q.peek().equals(s[i])) {
				q.poll();
			} 
		}
		
		System.out.println(count); 
		sc.close();
	}

}
