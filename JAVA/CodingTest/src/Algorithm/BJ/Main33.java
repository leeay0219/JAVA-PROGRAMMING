package Algorithm.BJ;
import java.util.*; 

public class Main33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Integer> q = new LinkedList<>();
		List <Integer> l = new LinkedList<>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			q.add(i);
		}
		
		int x = 0;
		
		while (!q.isEmpty()) {
			x = (x+k-1) % q.size(); 
			l.add(q.remove(x));
		}
		
		System.out.print("<");
		for (int i=0; i<l.size(); i++) {
			if (i != l.size()-1) {
				System.out.print(l.get(i) + ", ");
			}
			else 
				System.out.print(l.get(i));
		}
		System.out.print(">");
		
		sc.close();
	}

}
