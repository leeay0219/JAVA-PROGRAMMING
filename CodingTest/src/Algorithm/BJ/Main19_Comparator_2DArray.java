package Algorithm.BJ;
import java.util.*; 
public class Main19_Comparator_2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n = Integer.parseInt(sc.nextLine());
		int[][]a = new int[n][2];
		
		for (int i=0; i<n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}

		
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {
					return Integer.compare(a[1], b[1]);
				}
				
				return Integer.compare(a[0], b[0]); 
			}
		});
		
		for (int i=0; i<n; i++) {
			System.out.println(a[i][0] + " " + a[i][1]); 	
		}
		
		sc.close(); 
	}

}
