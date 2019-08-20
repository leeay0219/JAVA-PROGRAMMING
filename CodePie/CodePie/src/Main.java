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

	
	private static void getParent(int n, ArrayList<Integer>[] list, int[] seq) { //현재 노드에 부모 노드 값 저장 
		isVisited = new int[n+1];
		Queue<Integer> q = new LinkedList<>();
		q.offer(seq[1]); // seq[1]은 가장 처음 들어오는 배열값 
		
		isVisited[seq[1]] = 0; //방문 false
		
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int next : list[current]) {
				if(isVisited[next] != 0) continue;
				isVisited[next] = current; // 다음 visited 배열에 현재 값 담음 (q의 poll)
				q.offer(next);
			}
		}
	}
	private static String getResult(int n, ArrayList<Integer>[] list, int[] seq) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(seq[1]); // 가장 첫 순서 들어오는 배열값을 큐에 담기
		int index = 1;
		while(!q.isEmpty()) {
			int current = q.poll();
			int loop = list[current].size();

			while(loop-->0) { // 인접리스트 길이만큼 반복 (size가 0이 될때까지)
				index++; //인덱스값은 늘려주며 탐색
				if(current != isVisited[seq[index]]) return "0"; 
				//해당 seq[index]의 부모노드 값 (isvisited[seq[index]) 과 큐에서 나온 seq[i]값 비교해서 다르면 NO
				q.offer(seq[index]); // 그렇지 않으면 순서대로 (2,3,4.. 넣으며 비교)
			}
		}
		return "1"; // 큐 다 돌아주고 current와 isvisited[seq[index]] 같을때는 YES출력
	}
}