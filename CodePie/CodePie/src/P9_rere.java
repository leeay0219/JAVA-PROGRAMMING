import java.util.*; 
import java.io.*; 
public class P9_rere {
	static boolean visited[];
	static Queue <Integer> q;
	static int u; 
	static int v; 
	static String s="";
	static ArrayList<Integer>[] adjlist; 
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	     
	    int t = Integer.parseInt(sc.nextLine()); // testcase
	  
	    for (int i=0; i<t; i++) {
		    int n = Integer.parseInt(sc.nextLine()); // node 개수
	        adjlist = (ArrayList<Integer>[])new ArrayList[n+1];
	        
	        for(int j=0; j<adjlist.length; j++) { 
	            adjlist[j] = new ArrayList<Integer>();
	        }
	        
	        for(int j=0; j<n-1; j++) {
	        	sc = new Scanner(System.in);
	            u = sc.nextInt();
	            v = sc.nextInt();       
	            adjlist[u].add(v);
	            adjlist[v].add(u); // 양방향 간선 리스트에 저장
	            sc.nextLine();
	        }
	        
//	        for(int j=0; j<adjlist.length; j++) {
//	            Collections.sort(adjlist[j]);
//	        }
	        
	        String check = sc.nextLine(); //n번째라인 입력 받아서 비교
	        System.out.println("Case #" + (i+1));
	        System.out.println(s); 
	        if (check.trim().equals(s.trim())) {
	        	System.out.println("YES");
	        	break;
	        } else {
	        	System.out.println("NO");
	        	break;
	        }
	    }
	    sc.close();
	}
	
    public static void bfs(int v) {
    	q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()) {
            int x = q.poll();
            s += x + " ";
            for(int e : adjlist[v]) {
                if(!visited[e]) {
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
    }
}
