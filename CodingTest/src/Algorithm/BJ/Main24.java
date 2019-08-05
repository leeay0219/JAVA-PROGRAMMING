package Algorithm.BJ;
import java.util.*; 
public class Main24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] n = new int[7];
		int[] m = new int[7];
		int sum = 0; 

		for (int i=0; i<7; i++) {
			n[i] = sc.nextInt();
			if (n[i]%2 != 0) {
				m[i] = n[i];
				sum += m[i];
			}
		}
		
		if (sum!=0) {
		System.out.println(sum);
		} else
			System.out.println(-1); 

		Arrays.sort(m);
		for(int i=0; i<7; i++){
			if (m[i] != 0) {
				System.out.println(m[i]);
				break; 
			} 
		}

		sc.close();
	}

}
