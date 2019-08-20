import java.io.*;
import java.util.*;

public class Main {	
	private static int[] isVisited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
			
		ArrayList<Integer>[] tree = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			tree[i] = new ArrayList<>();
		}
			
		for(int i=1; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());			
			tree[from].add(to);
		}
		
		int[] sequence = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			sequence[i] = Integer.parseInt(st.nextToken());
		}
			
		getParent(N, tree, sequence);
		System.out.println(getResult(N, tree, sequence));
	}

	
	private static void getParent(int n, ArrayList<Integer>[] list, int[] seq) { //���� ��忡 �θ� ��� �� ���� 
		isVisited = new int[n+1];
		Queue<Integer> q = new LinkedList<>();
		q.offer(seq[1]); // seq[1]�� ���� ó�� ������ �迭�� 
		
		isVisited[seq[1]] = 0; //�湮 false
		
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int next : list[current]) {
				if(isVisited[next] != 0) continue;
				isVisited[next] = current; // ���� visited �迭�� ���� �� ���� (q�� poll)
				q.offer(next);
			}
		}
	}
	private static String getResult(int n, ArrayList<Integer>[] list, int[] seq) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(seq[1]); // ���� ù ���� ������ �迭���� ť�� ���
		int index = 1;
		while(!q.isEmpty()) {
			int current = q.poll();
			int loop = list[current].size();

			while(loop-->0) { // ��������Ʈ ���̸�ŭ �ݺ� (size�� 0�� �ɶ�����)
				index++; //�ε������� �÷��ָ� Ž��
				if(current != isVisited[seq[index]]) return "0"; 
				//�ش� seq[index]�� �θ��� �� (isvisited[seq[index]) �� ť���� ���� seq[i]�� ���ؼ� �ٸ��� NO
				q.offer(seq[index]); // �׷��� ������ ������� (2,3,4.. ������ ��)
			}
		}
		return "1"; // ť �� �����ְ� current�� isvisited[seq[index]] �������� YES���
	}
}