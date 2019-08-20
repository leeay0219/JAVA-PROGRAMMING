//
//BFS란 큐를 사용한 탐색 방법이다. BFS의 진행방법은 다음과 같다..


//
//①. 큐 안에1번 노드가 들어가 있다.
//
//②. 큐 안에 있는 노드를 꺼내고 출력한다.
//
//③. 방금 꺼낸 노드와 인접한 노드에 접근한 적이 없다면 큐 안에 넣는다.
//
//④. ②번과 ③번을 반복하다가 큐가 비었다면 종료한다.
//
//노드 N개의 간선의 방향이 없는 트리와 BFS의 탐색결과가 주어졌을 때 올바른 BFS탐색결과라면 “YES” 그렇지 않다면 “NO”를 출력하여라.
//
// 

//위의 그래프는 (1 2 3 4), (1 3 2 4) 두 가지 탐색결과를 가질 수 있다.
//
//INPUT FORMAT
//- 입력은 표준입력으로 제공된다.
//- 입력은 여러 테스트 케이스가 포함될 수 있다.
//- 첫째 줄에는 테스트 케이스의 개수를 나타내는 자연수 T가 주어진다. 이후 차례로 T개의 테스트 케이스가 주어진다. (1≤T≤30)
//- 각 테스트 케이스의 첫 줄에는 정점의 수 N이 주어진다. (1≤ N ≤5,000)
//- 다음 줄부터 N-1개의 줄에 두 정점(u, v) 사이의 간선이 주어진다. (단 u != v 이고 중복간선은 존재하지 않는다.)
//- 마지막 줄에 한 줄로 N개의 노드가 BFS의 탐색결과로 주어진다.
//OUTPUT FORMAT
//- 각 테스트 케이스의 답을 표준출력으로 출력해야 한다.
//- 각 테스트 케이스마다 첫 줄에는 “Case #C와 개행문자(newline)를 출력하여야 한다. 이때 C는 테스트 케이스의 번호이다.
//- 올바른 BFS라면 “YES” 그렇지 않다면 “NO” 를 출력하여라
//EXAMPLE
//입력	출력
//2
//4
//1 2
//1 3
//2 4
//1 2 3 4
//4
//1 2
//1 3
//2 4
//1 2 4 3
//
//Case #1
//YES
//Case #2
//NO



 
import java.util.*;
import java.io.*;
 
public class BFS {
    static int n;
    static int m;
    static int map[][];
    static int dx[] = {1,-1,0,0};
    static int dy[] = {0,0,-1,1};
    static boolean[] visit;
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        visit = new boolean[n+1];
        
 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            	Scanner sc = new Scanner(System.in);
                map[i][j] = sc.nextInt(); 
                sc.close();
            }
        }
        bw.flush();
        bw.close();
    }
    
        public static void bfs(){
	        Queue<Pair> q = new LinkedList<>();
	        q.add(new Pair(0,0));
	 
	        while(!q.isEmpty()){
	            Pair p = q.poll();
	 
	            for(int i=0;i<4;i++){
	                int nx = p.x + dx[i];
	                int ny = p.y + dy[i];
	                int [][] visit2 = new int[nx][ny];
	 
	                if(nx<0 || ny<0 || nx>=n || ny>=m)
	                    continue;
	                
	                if(map[nx][ny]==0 && visit2[nx][ny]==0){
	                    visit2[nx][ny]  = 1;
	                    q.add(new Pair(nx,ny));
	                }
	                if(map[nx][ny]==1){
	                    visit2[nx][ny]++;
	                    if(visit2[nx][ny]>=2)
	                    map[nx][ny]=0;
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
