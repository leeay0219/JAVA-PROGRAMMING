package Algorithm.BJ;

import java.util.*;
public class Main80 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		LinkedList <Integer> list[] = new LinkedList[n+1];
		int id[] = new int[n+1];
		
		for(int i=1; i<n+1; i++){
			list[i] = new LinkedList<>();
		}
		
		for(int i=0; i<m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			id[b]++;
		}
		
		LinkedList <Integer> q = new LinkedList<>();
		
		for(int i=1; i<n+1; i++){
			if(id[i]==0){
				q.offer(i);
				System.out.print(i+" ");
			}
		}
		
		while(!q.isEmpty()){
			int a = q.poll();
			for (int node : list[a]) {
				id[node]--;
				if(id[node]==0){
					q.add(node);
					System.out.print(node+" ");
				}
			}
		}
		sc.close();
	}
}