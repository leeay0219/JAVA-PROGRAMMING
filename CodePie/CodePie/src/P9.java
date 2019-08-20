import java.util.*; 

public class P9 {
	static boolean[] visit; 
	static int[][] map; 
	static int n; 
	static int u; 
	static int v;
	private static int[] dx;
	private static int[] dy; 
	static int[] a; 
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine()); 
		
		for (int i=0; i<t; i++) {
			n = Integer.parseInt(sc.nextLine()); // 노드 개수
			map = new int [n+1][n+1];
			visit = new boolean [n+1];
			
	        for(int j=0;j<n;j++){
	            for(int k=0;k<2;k++) {
	                map[j][k] = sc.nextInt();
	            }
	        }
	        
	        a = new int [n+1];
	        for (int j=0; j<n; j++) {
	        	 a[j] = sc.nextInt();
	        }
	        sc.nextLine();
	        
			System.out.println("Case #" + (i+1)); 
			
			for (int m=0; m<n; m++) {
				bfs();
				if (map[m][i]!=0) {
					System.out.println("YES");
				} else 
					System.out.println("NO"); 
			}
		}
		
		sc.close();
	}

	
    public static void bfs(){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
 
        while(!q.isEmpty()){
            Pair p = q.poll();
 
            for(int i=0;i<4;i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                int [][] visit = new int[nx][ny];
 
                if(nx<0 || ny<0 || nx>=n || ny>=u)
                    continue;
                
                if(map[nx][ny]==0 && visit[nx][ny]==0){
                    visit[nx][ny] = 1;
                    q.add(new Pair(nx,ny));
                }
                if(map[nx][ny]==1){
                    visit[nx][ny]++;
                    if(visit[nx][ny]>=2) {
                    	map[nx][ny]=0;
                    }
                }
            }
        }
    }

	static class Pair{
	    int x,y;
	    Pair(int x,int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}