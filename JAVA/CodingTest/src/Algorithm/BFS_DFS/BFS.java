package Algorithm.BFS_DFS;

import java.util.*;
import java.io.*; 

public class BFS {
	
	static int N, M; 
	static int[] visit; 
	static ArrayList <Integer>[] count; 

	public static void main(String[] args) throws Exception {
		count = new ArrayList[8]; 
		
		for (int i=1; i<=7; i++) {
			count[i] = new ArrayList<>();
		}
		
		count[1].add(2);
		count[1].add(3);
		count[1].add(7);
		count[2].add(4);
		count[3].add(5);
		count[3].add(6);
		
		Queue <Integer> q = new LinkedList<>(); 
		q.add(1);
		
		while (!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node + " ");
			
			for (int i=0; i<count[node].size(); i++) {
				int t = count[node].get(i); 
				q.add(t); 
			}
		}
		System.out.println();
	}

}
