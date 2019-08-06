package Algorithm.BFS_DFS;
import java.util.*; 
public class FindWay {
	static int[][]a;
	static int[] c; 
	static int[][] path;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine()); 
		a = new int[n+1][n+1];
		c = new int[n+1];
		path = new int[n+1][n+1];
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				a[i][j] = sc.nextInt();
			}
		}	
		
		for (int i=1; i<=n; i++) {
			DFS(i); 
			
			for (int j=1; j<=n; j++) {
				path[i][j] = c[j]; 
			}
			Arrays.fill(c,0);	
		}
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void DFS(int visit) {
		int n = a.length-1; 
		for (int i=1; i<=n; i++) {
			if (a[visit][i]==1 && c[i]==0) {
				c[i] = 1; 
				DFS(i);
			}
		}
	}
}