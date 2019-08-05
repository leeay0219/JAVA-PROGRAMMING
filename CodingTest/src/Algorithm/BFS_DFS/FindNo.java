package Algorithm.BFS_DFS;
import java.util.*; 

public class FindNo {
	static ArrayList<Integer>[]a; 
	static ArrayList<Integer> b = new ArrayList<>();
	static boolean[] c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine());
		
		a = new ArrayList[n+1]; 
		c = new boolean[n+1]; 
		
		for (int i=1; i<=n; i++) {
			a[i] = new ArrayList<>(); 
		}
		for (int i=1; i<=n; i++) {
			int m = sc.nextInt();
			a[i].add(m);
		}
		
		for(int i=1; i<=n; i++) {
			DFS(i);
		}
		System.out.println(b.size());
		
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
		
		sc.close(); 
	}
	
	public static void DFS(int k) {
		c[k] = true; 
		for (int i=0; i<a[k].size(); i++) {
			int next = a[k].get(i);
			if(c[next] == true & !b.contains(next)) { // 
				b.add(next);
			} 
			else if (c[next] == false) {
				DFS(a[k].get(i));
			}
			c[k] = false; 
		}
	}

}
