import java.util.*; 
public class BFS {
	static int n; 
	static int u; 
	static int v; 
	static int [][] map;
	static int dx[] = {1, -1, 0, 0}; 
	static int dy[] = {0, 0, -1, 1}; 
	static int [][] visit;
	
	static class Pair {
		int x,y; 
		Pair(int x, int y) {
			this.x = x; 
			this.y = y; 
		}
	}

	public static void bfs () {
		Queue<Pair>q = new LinkedList<>(); 
		q.add(new Pair(0,0));
		
		while (!q.isEmpty()) {
			Pair p = q.poll();
			
			for (int i=0; i<n; i++) {
				int nx = p.x + dx[i]; 
				int ny = p.y + dy[i]; 
				
				if (nx<0 || ny<0 || nx>=n || ny>=u) 
					continue; 
				
				if (map[nx][ny] == 0 && visit[nx][ny]==0) {
					visit[nx][ny] = 1; 
					q.add(new Pair (nx, ny));
				} 
				
				if (map[nx][ny] == 1) {
					visit[nx][ny]++; 
					if (visit[nx][ny]>=2)
						map[nx][ny]=0; 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine());
		
		for (int i=0; i<t; i++) {
			n = Integer.parseInt(sc.nextLine()); //node�� ��
			for (int j=0; j<n; j++) {
				u = sc.nextInt(); // �� ���� (u,v)�� ����
			}	
			map = new int[n+1][n+1];
			visit = new int [n+1][n+1]; 
			for (int k=0; k<n; k++) {
				for (int j=0; j<n; j++) {
					map[i][j] = sc.nextInt();
				}
				bfs();
				if (visit[i][k] == 1) {
					System.out.print("Case #" + (i+1) + "\n");
					System.out.println("YES"); 
				} else
					System.out.print("Case #" + (i+1) + "\n");
					System.out.println("NO"); 
			}
		}
		sc.close();
	}

}

//
//BFS�� ť�� ����� Ž�� ����̴�. BFS�� �������� ������ ����.
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
//
//
//
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

