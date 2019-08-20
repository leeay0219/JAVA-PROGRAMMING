//
//BFS�� ť�� ����� Ž�� ����̴�. BFS�� �������� ������ ����..


//
//��. ť �ȿ�1�� ��尡 �� �ִ�.
//
//��. ť �ȿ� �ִ� ��带 ������ ����Ѵ�.
//
//��. ��� ���� ���� ������ ��忡 ������ ���� ���ٸ� ť �ȿ� �ִ´�.
//
//��. ����� ����� �ݺ��ϴٰ� ť�� ����ٸ� �����Ѵ�.
//
//��� N���� ������ ������ ���� Ʈ���� BFS�� Ž������� �־����� �� �ùٸ� BFSŽ�������� ��YES�� �׷��� �ʴٸ� ��NO���� ����Ͽ���.
//
// 

//���� �׷����� (1 2 3 4), (1 3 2 4) �� ���� Ž������� ���� �� �ִ�.
//
//INPUT FORMAT
//- �Է��� ǥ���Է����� �����ȴ�.
//- �Է��� ���� �׽�Ʈ ���̽��� ���Ե� �� �ִ�.
//- ù° �ٿ��� �׽�Ʈ ���̽��� ������ ��Ÿ���� �ڿ��� T�� �־�����. ���� ���ʷ� T���� �׽�Ʈ ���̽��� �־�����. (1��T��30)
//- �� �׽�Ʈ ���̽��� ù �ٿ��� ������ �� N�� �־�����. (1�� N ��5,000)
//- ���� �ٺ��� N-1���� �ٿ� �� ����(u, v) ������ ������ �־�����. (�� u != v �̰� �ߺ������� �������� �ʴ´�.)
//- ������ �ٿ� �� �ٷ� N���� ��尡 BFS�� Ž������� �־�����.
//OUTPUT FORMAT
//- �� �׽�Ʈ ���̽��� ���� ǥ��������� ����ؾ� �Ѵ�.
//- �� �׽�Ʈ ���̽����� ù �ٿ��� ��Case #C�� ���๮��(newline)�� ����Ͽ��� �Ѵ�. �̶� C�� �׽�Ʈ ���̽��� ��ȣ�̴�.
//- �ùٸ� BFS��� ��YES�� �׷��� �ʴٸ� ��NO�� �� ����Ͽ���
//EXAMPLE
//�Է�	���
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
