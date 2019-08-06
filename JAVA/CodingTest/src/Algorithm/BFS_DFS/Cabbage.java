package Algorithm.BFS_DFS;
import java.util.*; 

public class Cabbage {
	static int[][]a;
	static boolean[][]visit; 
	static int n, m, k; 
	static int dy[] = {1, -1, 0, 0};
	static int dx[] = {0, 0, 1, -1}; //상하좌우
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine()); // testcase no
		
		for (int o = 0; o<t; o++) {
			m = sc.nextInt(); //배추밭 가로길이
			n = sc.nextInt(); //배추밭 세로길이
			k = sc.nextInt(); //배추있는곳 개수
	
			a = new int[m][n];
			visit = new boolean[m][n];
			
			for (int i=0; i<k; i++) {
				int x = sc.nextInt(); 
				int y = sc.nextInt();
				a[x][y]=1; // 단방향 
			}
			
			int count = 0; 
			for (int i=0; i<m; i++) {
				for (int j = 0; j<n; j++) {
					if (a[i][j] == 1 && visit[i][j]) {
						DFS(i,j);
						count++; 
					}
				}
			}
			System.out.println();
			System.out.println(count); 
		}
		sc.close();
	}
	
	public static void DFS(int x, int y) {
		visit[x][y] = true; 
		for (int i=0; i<4; i++) { //상하좌우확인
		       int ax = x + dx[i];
		       int ay = y + dy[i];
		       
		       if (isRange(ax, ay) && !visit[ax][ay] && a[ax][ay]==1) {
		    	   visit[ax][ay] = true; 
		    	   DFS(ax,ay);   
		       }
		}
	}
	
	public static boolean isRange(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n; 
	}
}
