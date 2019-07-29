package BJ;
import java.util.*; 
public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int answer; 
		HashSet <Integer> hs = new HashSet<>();
		for (int i=0; i<n; i++) {
			hs.add(sc.nextInt());
		}
		sc.nextLine(); 
		
		int m = Integer.parseInt(sc.nextLine());
		int[] arr = new int [m];
		
		for (int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<m; i++) {
			if (hs.contains(arr[i])) {
				answer = 1; 
			} else {
				answer = 0; 
			}
			System.out.println(answer);
		}
			
		
		sc.close(); 
	}
}
