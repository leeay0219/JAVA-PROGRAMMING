package Algorithm.BJ;
import java.util.*;
public class Main78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int back = 0;
		String[] s = new String[n];
		Queue <Integer> q = new LinkedList<>();
		
		for (int i=0; i<n; i++) {
			s[i] = sc.nextLine();
			if (s[i].contains("push ")) {
				s[i] = s[i].replace("push ", "");
				back = Integer.parseInt(s[i]);
				q.offer(Integer.parseInt(s[i]));
			} else if (s[i].equals("front")) {
				if (!q.isEmpty()) {
					System.out.println(q.peek());
				} else {
					System.out.println(-1);
				}
			} else if (s[i].equals("empty")) {
				if (!q.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else if (s[i].equals("size")) {
				System.out.println(q.size());
			} else if (s[i].equals("pop")) {
				if (!q.isEmpty()) {
					System.out.println(q.poll());
				} else {
					System.out.println(-1);
				}
			} else if (s[i].equals("back")) {
				if (!q.isEmpty()) {
					System.out.println(back);
				} else {
					System.out.println(-1);
				}
			}
		}
		sc.close();
	}

}
