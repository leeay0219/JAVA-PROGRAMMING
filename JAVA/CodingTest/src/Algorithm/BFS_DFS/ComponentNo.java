package Algorithm.BFS_DFS;
import java.util.*; 

public class ComponentNo {
	static int N, M; 
	static int visit[]; 
	static int graph[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		graph = new int[N+1][N+1];
		visit = new int[N+1]; 
		
		for(int i=0; i<M; i++) {
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			graph[x][y]=1;
			graph[y][x]=1; //양방향, 간선의 양 끝점
		}
		
		int count = 1;
		
		for (int i=1; i<=N; i++) {
			if (visit[i] == 0) {
				DFS(i, count); 
				count++;
			}
		}
		
		System.out.println(count-1); 
		sc.close();
	}
	
	public static void DFS(int x, int count) {
		visit[x] = count; 
		for (int i=1; i<=N; i++) {
			if (graph[x][i] == 1 && visit[i] == 0) {
				DFS(i, count);
			}
		}
	}
}
