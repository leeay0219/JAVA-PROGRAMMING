package Algorithm.BJ;
import java.util.*; 

public class Main67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[]nan = new int[9];
		int sum = 0; 
		boolean c = false; 
		
		for (int i=0; i<nan.length; i++) {
			nan[i] = Integer.parseInt(sc.nextLine());
			sum += nan[i];
		}
		
		for (int i=0; i<nan.length; i++) {
			if (c) break; 
			for (int j = 0; j<nan.length; j++) {
				if (i==j) continue;
				if (sum - nan[i] - nan[j] == 100) {
					nan[i] = 0;
					nan[j] = 0; 
					c = true;
					break; 
				}
			}
		}
		
		Arrays.sort(nan);
		
		for (int i=0; i<nan.length; i++) {
			if (nan[i] != 0) {
				System.out.println(nan[i]); 
			}
		}
		
		
		
		sc.close();
	}

}
