package Algorithm.BFS_DFS;
import java.util.*;

public class BJ_DFS_BFS_2DArray {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //node 수
		int m = sc.nextInt(); //간선 수
		int v = sc.nextInt(); //start node 번호
		
		int[][] a = new int [n+1][n+1]; //초기화
		//간선이 연결하는 두 정점의 번호 입력
		for (int i=0; i<m; i++) {
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			a[x][y]=1;
			a[y][x]=1; //양방향 간선이니까 반대도 똑같이 1 저장해줌
		}
		
		int c[] = new int[a[0].length];
		dfs(a, c, v);
		System.out.println();
		
		c = new int[a[0].length];
		bfs(a, c, v);
		
		sc.close();
	}

	public static void dfs(int[][]a, int[]c, int v) {
		System.out.print(v + " ");
		c[v] = 1; 
		
		for (int i=1; i<a[0].length; i++) {
			if (a[v][i] == 1 && c[i] == 0) {
				dfs(a, c, i);
			}
		}
	}

	public static void bfs(int[][]a, int[]c, int v) {
		Queue <Integer> q = new LinkedList<>();
		c[v] = 1; 
		q.add(v);
		
		while(!q.isEmpty()) {
			int n = q.poll(); 
			System.out.print(n +  " ");
			for(int i=0; i<a[0].length; i++) {
				if(a[n][i]==1 && c[i]==0){
					c[i]=1;
					q.add(i);
				}
			}		
		}
	}
}
