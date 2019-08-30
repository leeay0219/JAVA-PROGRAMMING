package Algorithm.BJ;
import java.util.*;
public class Main49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];
		for (int i=0; i<n; i++) {
			s[i] = sc.nextLine();
		}
		
		for (int i=0; i<n; i++) {
			String left = s[i].split(" ")[0];
			String right = s[i].split(" ")[1];
			char[] l = left.toCharArray();
			char[] r = right.toCharArray();
			int[] dist = new int[l.length];
			
			for (int j=0; j<l.length; j++) {
				if (r[j] >= l[j]) {
					dist[j] = r[j] - l[j];
				} else if (l[j] > r[j]) {
					dist[j] = (r[j] + 26) - l[j];
				}
			}
			
			System.out.print("Distances: ");
			
			for (int j=0; j<dist.length; j++) {
				if (j<dist.length-1) {
					System.out.print(dist[j] + " ");
				} else 
					System.out.print(dist[j]);
			}
			
			System.out.println(); 
		}
			
		sc.close();
	}

}
